package lesson23;

import java.util.ArrayList;

public class TasksStorageImpl implements TasksStorage {

    private ArrayList<Task> tasks = new ArrayList<>();

    @Override
    public synchronized void add(Task task) throws NullPointerException {
        if (task == null) {
            throw new NullPointerException("task == null");
        }
        tasks.add(task);
    }

    @Override
    public synchronized Task get() {
        if (tasks.size() == 0) {
            return null;
        }
        return tasks.remove(0);
    }

    @Override
    public synchronized int count() {//когда synchronized пишется в методе, монитором является слово this
        //synchronized: критическая зона, в ней может работать только один поток
        return tasks.size();
    }
}
