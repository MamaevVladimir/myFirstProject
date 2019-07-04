package lesson23;

public class TaskExecutorImpl extends Thread implements TaskExecutor {
    private TasksStorage storage;

    @Override
    public void setStorage(TasksStorage storage) throws NullPointerException {
        this.storage = storage;
    }

    @Override
    public TasksStorage getStorage() {
        return storage;
    }

    @Override
    public void run() {
        while (true) {
            Task task = storage.get();
            System.out.println(Thread.currentThread().getName() + "Взял задачу +" + task);
            if (task == null) {
                System.out.println(Thread.currentThread().getName() + "Завершает работу");
                break;
            }
            try {
                System.out.println(Thread.currentThread().getName() + "Начал выполнять задачу -" + task);
                task.execute();
                System.out.println(Thread.currentThread().getName() + "Задача выполнена -" + task);
            } catch (TaskExecutionFailedException e) {
                System.out.println(Thread.currentThread().getName() + "Невозможно выполнить задачу!" + task);
                if (task.getTryCount() > 4) {
                    System.out.println(Thread.currentThread().getName() + "Задачу удаляем!" + task);
                }else{
                    task.incTryCount();
                    storage.add(task);
                    System.out.println(Thread.currentThread().getName() + "Задачу добавили обратно" + task);
                }
            }
        }
    }
}
