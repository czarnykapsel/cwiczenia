package objects;

public class Diamond {
    // przekatne - to jest pole klasy
    double e;
    double f;

    public Diamond (double e, double f){
        // kostruktor tworzacy przekatne moze byc kilka konstruktorow(przeciazanie)okreslajacych rozne warunki dla tych samych pol

        //parametry klasy przypisane do pola
        this.e = e;
        this.f = f;
        // wywoanie konstruktora
//        this(e, f, color);
//
    }

    double countArea(){
        return e*f;
    }
}
