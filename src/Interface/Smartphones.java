package Interface;

public interface Smartphones {
    default void call () {
        System.out.println("Ring ring");
    }
    void sms();
    void internet();
}
