package lesson12;

public interface Phone {// необходим для списка обязательных методов,
    // которые должны быть у каждого типа данных

    public abstract void call();// по умолчанию уже есть public abstract;

    void sendMessage(String message); // интерфейс является шаблоном

}
