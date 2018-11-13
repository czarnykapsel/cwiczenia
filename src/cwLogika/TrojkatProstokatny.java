package cwLogika;

import java.util.Scanner;

public class TrojkatProstokatny {

    public static void main(String[] args) {
        int A = readNumberFromConsole(1);
        int B = readNumberFromConsole(2);
        int C = readNumberFromConsole(3);
        boolean result = triangle (A, B, C);
        System.out.println(result);

    }

    static int readNumberFromConsole(int numberInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(("Podaj liczbe: " + numberInOrder));
        return scanner.nextInt();
    }

    static boolean triangle (int A, int B, int C){
        boolean result = true;

        if (A*A + B*B == C*C || A*A + C*C == B*B || B*B + C*C == A*A) {
            result = true;
        }
        else {
            result = false;
        }

        return result;
    }
}
