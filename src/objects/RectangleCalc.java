package objects;

public class RectangleCalc {
    public static void main(String[] args) {
        rectangle bigRec = new rectangle (15.0, 8.0);
        rectangle secondRec = new rectangle(6.0, 3.0 );

        System.out.println(bigRec.counterArea());
        System.out.println(bigRec.counterPerimeter());
        System.out.println(secondRec.counterArea());
        System.out.println(secondRec.counterPerimeter());

    }
}
