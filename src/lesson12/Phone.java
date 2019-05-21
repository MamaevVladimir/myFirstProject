package lesson12;

public interface Phone {// необходим для списка методов, характерных для данного класса

    public abstract void call();// по умолчанию уже есть public abstract;

    void sendMessage(String message); // интерфейс является шаблоном


}
