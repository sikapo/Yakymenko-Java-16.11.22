package MusicStyles;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] popBandsArray = {"Michael Jackson", "Madonna", "Bruno Mars"};
        String[] rockBandsArray = {"Metallica", "Linkin Park", "SOAD"};
        String[] classicBandsArray = {"Johann Pachelbel", "Wolfgang Mozart", "Edvard Grieg"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the music genre: pop, rock or classic");
        String genre = scanner.nextLine().toLowerCase();

        if (genre.equals("pop")) {
            PopMusic popMusic = new PopMusic();
            popMusic.playMusic();
            for (String s : popBandsArray) {
                System.out.println(s);
            }
        }
        if (genre.equals("rock")) {
            RockMusic rockMusic = new RockMusic();
            rockMusic.playMusic();
            for (String s : rockBandsArray) {
                System.out.println(s);
            }
        }
        if (genre.equals("classic")) {
            ClassicMusic classicMusic = new ClassicMusic();
            classicMusic.playMusic();
            for (String s : classicBandsArray) {
                System.out.println(s);
            }
        }
    }
}
