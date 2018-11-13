package cwLogika;

import java.util.Scanner;

public class Alfabet {

    static int read(String userLetter) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(("Podaj slowo: " + userLetter));
        return scanner.nextInt();
    }


}
