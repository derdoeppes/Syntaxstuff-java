public class Main {
    public static void main(String[] args) {

        //If Abfragen zum Erstellen von Bedingungen

        // Vergleichsoperatoren
        // kleiner als     <
        // größer als      >
        // kleiner gleich  <=
        // größer gleich   >=
        // gleich          ==
        // ungleich        !=

        int age3 = 16;

        if (age3 >= 18) {
            System.out.println("Du darfst das Computerspiel ab 18 spielen");
        }

        // es wird nicht ausgegeben weil nicht volljährig

        int age4 = 19;

        if (age4 >= 18) {
            System.out.println("Du darfst das Computerspiel ab 18 spielen");
        }

        // es wird ausgegeben weil volljährig


        int age5 = 17;

        if (age5 >= 18) {
            System.out.println("Du darfst das Computerspiel spielen");
        } else {
            System.out.println("Du bist leider zu jung um das Computerspiel ab 18 zu spielen!");
        }

        // da "if" nicht zutrifft wird "else" ausgegeben

    }

}