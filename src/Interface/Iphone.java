package Interface;

public class Iphone implements Smartphones, IOS{
    @Override
    public void call() {
        System.out.println("Iphone ringtone");
    }

    @Override
    public void iphoneCallSound() {
        System.out.println("iOS call sound");
    }

    @Override
    public void sms() {
        System.out.println("Iphone message tone");
    }

    @Override
    public void internet() {
        System.out.println("Opening Safari for surfing");
    }
}
