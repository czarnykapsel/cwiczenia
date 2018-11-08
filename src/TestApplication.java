public class TestApplication {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int myNumber = 10;
        float mySecondNumber =10.7f;
        String myText ="To jest moj napis";
        char myChar ='f';
        float myAnotherNumber = mySecondNumber + 10.7f * 2;

        myNumber = myNumber - 1;
        myNumber -= 1;

        System.out.println(myNumber);
        System.out.println(myText);

        int my2Number = 127;
        int anotherOne = 20;

        byte result =(byte) (my2Number + anotherOne);
        System.out.println(result);


    }
}
