package cwLogika;

public class logika
{
    public static void main(String[] args) {

        boolean isCircle = true;
        double r = 5.25;

        double circleField = 3.14 * r;

        if (isCircle && r>10) {
            System.out.println("To jest duze kolo");
        } else if (isCircle) {
            System.out.println("To jest male kolo");
        } else {
            System.out.println ("To nie jest w ogole kolo");

        }
    }
}
