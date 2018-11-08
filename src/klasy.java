public class klasy {

    public static void main(String[] args) {
        int[] yCoordinates = {1, 2, 3, 4, 5};
        int[] xCoordinates = {5, 6, 7, 8, 9};
        int xCoordinatesSum = counntSumOfElements(xCoordinates);
        int yCoordinatesSum = counntSumOfElements(yCoordinates);

        double xAverage = average(xCoordinates);
        double yAverage = average(yCoordinates);
        System.out.println(xAverage);
        System.out.println(yAverage);

    }

    static int counntSumOfElements(int[] inputArray) {
        int sum = 0;
        for (int i = 0; i< inputArray.length; i++){
            sum += inputArray[i];

        }
        return sum;
    }

        static double average(int[] inputArray){
            int sum =counntSumOfElements(inputArray);
            int length = inputArray.length;
            double average =(double)sum/length;

            return average;
    }

    }


