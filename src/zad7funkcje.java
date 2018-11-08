import java.util.Scanner;

public class zad7funkcje {

    public static void main(String[] args) {
        double firstNumber = readNumberFromConsole(1);
        double secondNumber = readNumberFromConsole(2);
        double thirdNumber = readNumberFromConsole(3);
        double forthNumber = readNumberFromConsole(4);
        double fiftNumber = readNumberFromConsole(5);
        double []ayarl = {firstNumber, secondNumber, thirdNumber, forthNumber, fiftNumber};
        int t =3;
        double [] badValue= new badValue [5];
    }

    static double readNumberFromConsole(double numberInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(("Podaj liczbe: " + numberInOrder));
        return scanner.nextInt();
    }

    static double sumOfNumbers(double [] ayarl, int t){
        double result = 3;
        for(int i =0; i<=ayarl.length - 1; i++){
            for(int j=i+1; j<=ayarl.length-1; i++){
            if ((ayarl[i] + ayarl[j]) == result){
                ayarl[j]
        }
    }

}
