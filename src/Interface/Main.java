package Interface;

public class Main {
    public static void main(String[] args) {
    Android android = new Android();
    android.call();
    android.linuxosCallSound();

        Android androidSms = new Android();
        androidSms.sms();

            Android androidInternet = new Android();
            androidInternet.internet();

        System.out.println("");

    Iphone iphone = new Iphone();
    iphone.call();
    iphone.iphoneCallSound();

        Iphone iphoneSms = new Iphone();
        iphoneSms.sms();

            Iphone iphoneInternet = new Iphone();
            iphoneInternet.internet();

    }

}
