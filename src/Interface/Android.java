package Interface;

public class Android implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Android ring sound");
    }

    @Override
    public void linuxosCallSound() {
        System.out.println("Linux call sound");
    }

    @Override
    public void sms() {
        System.out.println("Android message tone");
    }

    @Override
    public void internet() {
        System.out.println("Opening Chrome for surfing");
    }
}
