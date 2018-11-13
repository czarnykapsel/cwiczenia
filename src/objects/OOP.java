package objects;

public class OOP {
    public static void main(String[] args) {

//        Diamond[] diamonds = new Diamond[10]; tablica wielu rombow
//
//        for (int i=0; i <10; i++) {
//            diamonds [i] = new Diamond(i, i);
//        }

        Diamond smallDiamond = new Diamond(10.0, 15.0);
        Diamond bigDiamond = new Diamond(20.0, 45.0);

        System.out.println("pole malego rombu " + smallDiamond.countArea());
        System.out.println("pole duzego rombu " + bigDiamond.countArea());

//        smallDiamond.e = 10.0;
//        smallDiamond.f = 15.0;

      //  double p = smallDiamond.e * smallDiamond.f;

//        System.out.println("Pole rombu: " + smallDiamond.countArea());
//
//        int[] array = new int[5];
//        System.out.println(array);
    }
}