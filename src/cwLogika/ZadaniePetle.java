package cwLogika;

import java.util.Scanner;

public class ZadaniePetle {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Podaj liczbe 1:");
            int firstNumber = in.nextInt();
            System.out.println("Podaj liczbe 2:");
            int secondNumber = in.nextInt();

/*
            int first = 0;
            int second = 1;
            int result = 0;


            if (firstNumber == 0) {
                System.out.println(0);
            }
            else if (firstNumber == 1 || firstNumber == 2) {
                System.out.println(1);
            } else {

                for (int i = 2; i < firstNumber; i++) {

                    result = first + second;
                    first= second;
                    second = result;}

                    System.out.println(result);}
*/
/*
int result =0;
if(firstNumber >0) {
    for (int i = 0; i < firstNumber; i++) {

        result = result + i*i;
    }
    System.out.println(result);
} */
            System.out.println("Podaj dzialanie:");
            String operation= in.next();


            switch (operation){
                case "+":
                    System.out.println(firstNumber + secondNumber);
                    break;
                case "-":
                    System.out.println(firstNumber - secondNumber);
                    break;
                case "*":
                    System.out.println(firstNumber * secondNumber);
                    break;
                case "/":
                    System.out.println(firstNumber * secondNumber);
                default:
                        break;
            }
            }
        }


