package Figures;

public class Triangle extends Figure{
    double a;
    double h;


    public Triangle(double a, double h, String color){
        super(color);
        this.a = a;
        this.h = h;
    }

    @Override
    public double countArea() {
        return (a * h)/2;
    }
}
