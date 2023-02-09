public class AvgSpeed {

    public static void main(String[] args) {
        double hours = 1;
        double minutes = 40;
        double seconds = 35;
        double distanceMiles = 24;

        double distanceKilos = distanceMiles * 1.6;
        double timeMinutes = (hours * 60) + minutes + (seconds / 60);
        double kilosPerHour = (distanceKilos * 60) / timeMinutes ;
                System.out.println(kilosPerHour);


    }

}
