package cwLogika;

import java.util.Scanner;

public class zad4funkcje {

    public static void main(String[] args) {
        double firstNumber = readNumberFromConsole(1);
        double secondNumber = readNumberFromConsole(2);
        String action = readOperation();
        Double finalResult = result(action, firstNumber, secondNumber);
        System.out.println(finalResult);
    }

    static double readNumberFromConsole(double numberInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(("Podaj liczbe: " + numberInOrder));
        return scanner.nextInt();
    }

    static String readOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dzialanie:");
        String operation = scanner.next();
        return operation;

    }

    static double result(String action, double firstNumber, double secondNumber) {

        double result = 0;
        switch (action){
        case "+":
            result = firstNumber + secondNumber;
            break;
        case "-":
        result = firstNumber - secondNumber;
        break;
        case "*":
        result = firstNumber * secondNumber;
        break;
        case "/":
        result = firstNumber / secondNumber; }


        return result;


    }
}



