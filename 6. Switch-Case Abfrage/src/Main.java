public class Main {
    public static void main(String[] args) {

        // Switch-Case Abfrage
        // ein Case ist eine Konstanter "Fall" und keine Bedingung wie bei if
        // das break heißt einfach, falls der Case eintritt, nach dieser zeile stoppen
        // default ist quasi, wenn kein case eintritt

        int month1 = 3;

        switch (month1) {
            case 1:
                System.out.println("Januar");
                break;
            case 2:
                System.out.println("Februar");
                break;
            case 3:
                System.out.println("März");
                break;
            default:
                System.out.println("anderer Monat");
        }

        //simpel

        int month2 = 2;

        switch (month2) {
            case 1, 2, 12:
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                System.out.println("Frühling");
                break;
            case 6, 7, 8:
                System.out.println("Sommer");
                break;
            case 9, 10, 11:
                System.out.println("Herbst");
                break;
            default:
                System.out.println("Kein Monat");
        }

        //mehrere cases gleicher printout

    }
}