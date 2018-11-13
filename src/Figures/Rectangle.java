package Figures;

public class Rectangle extends Figure {
   protected double a;
    double b;


    public Rectangle(double a, double b, String color){
        super(color);
        this.a = a;
        this.b = b;
    }
        public double countArea(){

        return b*a;
    }

    }
