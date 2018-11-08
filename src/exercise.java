import java.util.Arrays;

public class exercise {

    public static void main(String[] args) {


        double[] xCoordinates = {10,20, 30, 51.5};
        System.out.println(Arrays.toString(xCoordinates));
        int xSum = counntSumOfElements (xCoordinates);



    }

    private static int counntSumOfElements(double[] xCoordinates) {
        int sum = 0;
        double[] newArray = {1.0, 2.0, 3.0};
        for (int i = 0; i< xCoordinates.length; i++){
            sum += xCoordinates[i];

        }
        return sum;
    }
}
