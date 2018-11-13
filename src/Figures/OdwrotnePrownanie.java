package Figures;

public class OdwrotnePrownanie {
    public static void main(String[] args) {
        Rectangle myRect = new Squere(10, "red");
        Rectangle mySquare = new Rectangle(10, 20, "blue");
        Rectangle mySquare2 = new Rectangle(15, 30, "blue");
        Triangle myTri = new Triangle(7, 6, "blue");

        Figure[] figures = new Figure[4];
        figures[0] = myRect;
        figures [1]= mySquare;
        figures [2]= mySquare2;
        figures [3]= myTri;

        double area =0.0;
        for (Figure figure: figures){
            area += figure.countArea();
        }
        System.out.println("Area of all fields: " + area);
    }
}
