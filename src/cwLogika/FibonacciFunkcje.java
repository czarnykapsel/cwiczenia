package cwLogika;

import java.util.Scanner;

public class FibonacciFunkcje {

    public static void main(String[] args) {
        int number = readNumberFromConsole(1);
        int result = numberFibonaci(number);
        System.out.println(result);
    }


    static int readNumberFromConsole(int numberInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(("Podaj liczbe: " + numberInOrder));
        return scanner.nextInt();
    }

    static int numberFibonaci(int number) {
        int result= 0;
        if (number > 1) {
     result = numberFibonaci(number-1) + numberFibonaci(number-2);
        }
        else if (number ==0){
            result =0;
        }
        else{
            result = 1;
        }
return result;

    }
}
