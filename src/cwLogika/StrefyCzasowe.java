package cwLogika;

public class StrefyCzasowe {

    public static void main(String[] args) {

        double myPoint = 98.123;
        double myTimeHour = 10;
        double myTimeMinutes = 25;

        Hemisphere myHemisphere = Hemisphere.EAST;

        double destPoint = 123.123;
        Hemisphere destHemisphere = Hemisphere.WEST;

        final int minutesPerDeg = 4;
        double minuteDiff = 0.0;

        //1. sprawdzamy czy czas odjac czy dodac
        //2. wyliczamy roznice minut
        //3. wypisujemy ladna informacje z godzina i minutami

        if (myHemisphere != destHemisphere) {
            destPoint *= -1;
        }
        if (myPoint > destPoint) {
            minuteDiff = (myPoint - destPoint) * 4;
        } else {
            minuteDiff = (destPoint - myPoint) * 4;
        }

        double myMinutes = myTimeHour * 60 + myTimeMinutes;
        double destMinutes = myMinutes + minuteDiff;
        int destTimeHour = (int) destMinutes / 60;
        int destTimeMinutes = (int) destMinutes % 60;

        if(destTimeHour > 24){
            destTimeHour -=24;
        }
        System.out.println(destTimeHour + ":" + destTimeMinutes);
    }

    enum Hemisphere {WEST, EAST}
}

