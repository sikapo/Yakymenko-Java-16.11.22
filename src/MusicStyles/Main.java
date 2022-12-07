package MusicStyles;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String [] popBandsArray = {"Michael Jackson", "Madonna", "Bruno Mars"};
        String [] rockBandsArray = {"Metallica", "Linkin Park", "SOAD"};
        String [] classicBandsArray = {"Johann Pachelbel", "Wolfgang Mozart", "Edvard Grieg"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the music genre: pop, rock or classic");
        String genre = scanner.nextLine().toLowerCase();

        if (genre.equals("pop")) {
            PopMusic popMusic = new PopMusic();
            popMusic.playMusic();
            for (int i = 0; i < popBandsArray.length; i++) {
                System.out.println(popBandsArray[i]);
            }
        }
        if (genre.equals("rock")) {
            RockMusic rockMusic = new RockMusic();
            rockMusic.playMusic();
            for (int i = 0; i < rockBandsArray.length; i++) {
                System.out.println(rockBandsArray[i]);
            }
        }
        if (genre.equals("classic")) {
            ClassicMusic classicMusic = new ClassicMusic();
            classicMusic.playMusic();
            for (int i = 0; i < classicBandsArray.length; i++) {
                System.out.println(classicBandsArray[i]);
            }
        }
    }
}
