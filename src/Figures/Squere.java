package Figures;

public class Squere extends Rectangle {
    double a;


    public Squere(double a, String color) {
        super(a, a, color);
    }

    //nadpisanie wartosci w inteliJ oznaczone przez @Override
    public void setA(double a) {
        this.a = a;
        this.b = a;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }
        //instamceof porwnuje faktyczne typy tutaj porownuje czy obj jest kwadratem(typ kwadrat)
        if (obj instanceof Squere) {
            Squere squareToCompere = (Squere) obj;
            if (this.a == squareToCompere.a &&
                    this.b == squareToCompere.b){
                return true;
            }else{
                return false;
            }
        } else{
            return false;
        }

    }
}
