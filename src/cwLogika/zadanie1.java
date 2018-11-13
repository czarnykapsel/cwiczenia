package cwLogika;

import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe 1:");
        int firstNumber = in.nextInt();
        System.out.println("Podaj liczbe 2:");
        int secondNumber = in.nextInt();
        System.out.println("Podaj liczbe 3:");
        int thirdNumber = in.nextInt();

        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);

        double averege= (firstNumber+secondNumber+thirdNumber)/3;

        System.out.println(averege);

// zadanie 1

int liczba = in.nextInt();

                if(liczba >= 0 ){
                    System.out.println(liczba);
                }else

                    {
                    int Bez = liczba * -1;
                        System.out.println(Bez);
                }

//Zadanie 2

        System.out.println("Podaj liczbe 1:");
        int fourthNumber = in.nextInt();
        System.out.println("Podaj liczbe 2:");
        int fiftNumber = in.nextInt();
        System.out.println("Podaj liczbe 3:");
        int sixNumber = in.nextInt();

        if(fourthNumber > fiftNumber && fiftNumber > sixNumber){
            System.out.println(fourthNumber);}
            else if (sixNumber > fiftNumber && fiftNumber > fourthNumber) {
            System.out.println(sixNumber);}
        else if (fiftNumber > sixNumber && sixNumber > fourthNumber) {
            System.out.println(fiftNumber);}
            else if (sixNumber == fiftNumber && fiftNumber == fourthNumber){
            System.out.println(sixNumber +" "+fiftNumber+" "+fourthNumber);
            }
            else if (sixNumber == fiftNumber && fiftNumber > fourthNumber) {
            System.out.println(sixNumber + " " + fiftNumber);
        }
        else if (sixNumber < fiftNumber && fiftNumber == fourthNumber){
            System.out.println(fiftNumber+" "+fourthNumber);}

        }



    }


