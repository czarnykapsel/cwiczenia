package Figures;

public class test {
    public static void main(String[] args) {
        Squere kwadrat = new Squere(6, "blue");
        Squere prostokat = new Squere(5.0,"blue");

        if (kwadrat.equals(prostokat)){
            System.out.println("sa rowne");
        }

        System.out.println(kwadrat.countArea());
        System.out.println(prostokat.countArea());
    }
}
