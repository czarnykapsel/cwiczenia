package cwLogika;

import java.util.Scanner;

public class zadaniaTyg2 {

    public static void main(String[] args) {

        double variableA = readNumberFromConsole(1);
        double variableB = readNumberFromConsole(2);
        double variableC = readNumberFromConsole(3);
        double delta = findDelta(variableA, variableB, variableC);
        String result = findResult( variableA, variableB, variableC, delta);
        System.out.println(delta);
        System.out.println(result);

    }

    // numbers scanning
    static double readNumberFromConsole(double numberInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(("Podaj liczbe: " + numberInOrder));
        return scanner.nextInt();
    }

    //find delta for square equation

    static double findDelta(double variableA, double variableB, double variableC) {
        double delta = (variableB * variableB) - 4 * variableA * variableC;

        return delta;
    }
    //find result
    static String findResult(double variableA, double variableB, double variableC, double delta){
        double x1 = 0;
        double x2 = 0;
        double x0 = 0;
        String result = "0";

        if (delta > 0){
             x1 = (- variableB-Math.sqrt(delta))/(2 * variableA);
            x2 = (- variableB-Math.sqrt(delta))/(2 * variableA);
            result = "x1 = "+ x1+ " " + "x2 = " +x2;       }


        else if (delta == 0){
             x0 = - variableB/(2*variableA);
        result = "x0 = "+ x0;}

             else {
            result = "No solution";
        }

return result;

    }



}
