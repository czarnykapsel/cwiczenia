package cwLogika;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.Scanner;

public class zad7funkcje {

    public static void main(String[] args) {
        double firstNumber = readNumberFromConsole(1);
        double secondNumber = readNumberFromConsole(2);
        double thirdNumber = readNumberFromConsole(3);
        double forthNumber = readNumberFromConsole(4);
        double fiftNumber = readNumberFromConsole(5);
        double[] ayarl = {firstNumber, secondNumber, thirdNumber, forthNumber, fiftNumber};
        double t = 3.0;
        //double[] badValue = findingIndexToRemove();
        //findingBadNumbers(ayarl, t, badValue);
        int badValCount = 0;
        int result = (ayarl.length - badValCount);
        double[] resultTab = new double[result];
        System.out.println(Arrays.toString(ayarl));
      // System.out.println(Arrays.toString(badValue));
        System.out.println(Arrays.toString(resultTab));
    }

    static double readNumberFromConsole(double numberInOrder) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(("Podaj liczbe: " + numberInOrder));
        return scanner.nextInt();
    }

    static double findingIndexToRemove(double[] ayarl, double t, double[] badValue) {
        //int badValCount = 0;
        for (int i = 0; i < ayarl.length - 1; i++) {
            //for (int j = i + 1; j < ayarl.length-1; j++) {

            if ((ayarl[i] + ayarl[i + 1]) == t) {
                // System.out.println(ayarl[i+1]);
                return i + 1;
            }
        }
        return -1;
    }

    // TODO: to be implemented
    static double[] newTab(double[] ayarl, double[] badValue) {
        throw new UnsupportedOperationException("not implemented yet");

    }
//    static double findRightNumbers(double[] badValue, int t, double[] resultTab, double[] ayarl) {
//
//        for (int i = 0; i <= ayarl.length - 1; i++) {
//
//            if ((badValue[i]  == t)) {
//                ayarl[i] = resultTab[i];
//            }
//        }
//        return 0;
    //  }

//
//        return t;
//    }
}
