package objects;

public class rectangle {

    double a;
    double b;

public rectangle (double a, double b){
    this.a = a;
    this.b =b;
}
    public double counterArea(){
       return a*b;
    }

    public double counterPerimeter(){
        return 2*a + 2*b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
