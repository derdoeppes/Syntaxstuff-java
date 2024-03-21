public class Main {
    public static void main(String[] args) {

        int age = 22;         //Initialisierung

        int age2;             //Deklaration
        age2 = 22;            //Zuweisung später in Programm

        System.out.println(age2);

        age2 = 30;           //Neuzuweisung

        System.out.println(age2);


        //------------------------------------------------------------------------//
        System.out.println("-------------------------------");
        //------------------------------------------------------------------------//
        //Datentypen

        // double  = kommazahl
        // int     = ganzzahl
        // boolean = true/false
        // string  = Wort oder Satz
        // char    = einzelnes Zeichen

        boolean test = true;
        System.out.println(test);

        double kommazahl = 2.3;
        System.out.println(kommazahl);

        //-------------------------------------------------------------------------//
        System.out.println("-------------------------------");
        //------------------------------------------------------------------------//
        // Klasse "string"
        // eine Klasse ist ein quasi  ein komplexer Datentyp (mehrere Wörter oder Zahlen)
        // Man kann auch eigene Klassen erstellen siehe weiter unten

        String animals = "ape and dog";
        System.out.println(animals + " and cat");


        //------------------------------------------------------------------------//
        System.out.println("-------------------------------");
        //-------------------------------------------------------------------------//
        //Arithmetische Operatoren

        // Vorzeichen  oder Subtraktion   -
        // Vorzeichen  oder Addition      +
        // Multiplikation                 *
        // Division                       /
        // Zuweisungszeichen              =

        int number1 = 3 + 9;
        System.out.println(number1);

        int number2 = 3;
        int number3 = 9;
        int result = number2 + number3;
        System.out.println(result);

        int number4 = 3;
        int number5 = 9;
        System.out.println(number4 + number5);

        int number6 = 3;
        int number7 = 9;
        System.out.println(number6 + "" + number7);


        //----------------------------------------------------------------------------//
        System.out.println("-------------------------------");
        //---------------------------------------------------------------------------//
        // Der Modulo Operator (der "Rest" bei der Division) % anstatt /

        int number8 = 32 / 3;
        System.out.println(number8);

        int number9 = 32 % 3;
        System.out.println(number9);


        //---------------------------------------------------------------------------//
        System.out.println("-------------------------------");
        //---------------------------------------------------------------------------//
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


        //------------------------------------------------------------------------------------------//
        System.out.println("-------------------------------");
        //-----------------------------------------------------------------------------------------//
        // Switch-Case Abfrage
        // ein Case ist eine Konstanter "Fall" und keine Bedingung wie bei if
        // das break heißt einfach falls der case eintritt nach dieser zeile stoppen
        // default ist quasi wenn kein case eintritt

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


        //------------------------------------------------------------------------------------------//
        System.out.println("-------------------------------");
        //-----------------------------------------------------------------------------------------//
        // While Schleife


        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);

        //1-5 nacheinander auf der Konsole

        int number22 = 1;

        while (number22 <= 5) {
            System.out.println(number22);
            number22 = number22 + 1;                 // geht auch mit "number22 +=" für alle Zahlen //
        }


        //------------------------------------------------------------------------------------------//
        System.out.println("-------------------------------");
        //-----------------------------------------------------------------------------------------//
        //Do-While Schleife (ist im grunde genommen eine While schleife mit Erweiterung)


        int number21 = 1;

        do {
            System.out.println();
            number21++;
        }


        while (number21 <= 5);

        //bei while Schleife wird erst Bedingung geprüft und bei Do-While erst einmal ausgeführt und dann geprüft


        //------------------------------------------------------------------------------------------//
        System.out.println("-------------------------------");
        //-----------------------------------------------------------------------------------------//
        //For Schleife
        //auch Zählerschleife, weil man sie nutzt, wenn man genau weiß wie oft die Schleife durchlaufen soll


        for (int i = 2; i < 10; i += 2) {
            System.out.println(i);
        }

        //------------------------------------------------------------------------------------------//
        System.out.println("-------------------------------");
        //-----------------------------------------------------------------------------------------//
        //Verschachtelte Schleifen


        for (int j = 1; j < 4; j++) {                  // hier weiß ich das ich 3 mal die Schleife durchlaufen lassen möchte (1 bis 4 ist gleich 3)

            for (int p = 1; p < 4; p++) {                 // nicht auch j benennen
                System.out.print("[ ] ");               // Unterschied zu println ist, dass kein Zeilenumbruch nach Befehl getätigt wird
            }
            System.out.println();                       // damit nach "p-Schleife" Zeilenumbruch bevor wieder in i Schleife Sprung
        }

        //------------------------------------------------------------------------------------------//
        System.out.println("-------------------------------");
        //-----------------------------------------------------------------------------------------//
        //Arrays
        //ist wie ein string nur mit mehreren zugewiesenen Werten

        String[] names = new String[3];    // Die größe eines Arrays wird immer bei Initialisierung festgelegt (hier 3)

        names[0] = "Justus";               // 0 ist in Arrays der erste von 3 "Plätzen"
        names[1] = "Nils";
        names[2] = "Lina";

        System.out.println(names[1]);
        System.out.println();

        // hier noch einmal ein Array mit einer kleinen Schleife

        String[] names2 = new String[4];

        names2[0] = "Justus";
        names2[1] = "Nils";
        names2[2] = "Lina";

        for(int u = 0; u < names2.length; u++) {            //length steht für die maximale länge des Arrays
            System.out.println(names2[u]);                  // es wird in einem Array 0 ausgegeben, wenn etwas noch nicht definiert hier die 4. pos im Array
        }


        System.out.println();


        // String[] names3 = {"Justus", "Nils", "Lina"};      // festgelegte Reihenfolge wie die namen ausgegeben oben kann ich sie auch mit einer anderen Schleife zb. Rückwärts ausgeben
        // automatisch Arraylänge 3
        // Unterschied Liste und Array
    /* Der Unterschied zwischen einer Liste und einem Array offenbart sich schon bei der Initialisierung/Deklarierung. Bei einem Array muss man schon vor dem Benutzen
     die genaue Länge angeben. Dies ist insofern unpraktisch, wenn man noch gar nicht weiß, wie groß das Array überhaupt wird. Diese Gedanken muss man sich bei einer Liste nicht machen,
     sie wächst einfach dynamisch mit. Damit ist das Vergrößern und auch das Verkleinern während der Laufzeit kein Problem. */


        //------------------------------------------------------------------------------------------//
        System.out.println("-------------------------------");
        //-----------------------------------------------------------------------------------------//
        // mehrdimensionales Array

        String[][] firstAndLastName = new String[5][2];         // 5 Namen und für jeden Namen einen Nachnamen (kann man sich wie eine Tabelle mit Zeilen und Spalten vorstellen)

        firstAndLastName[0][0] = "Nils ";
        firstAndLastName[0][1] = "Döppes";

        firstAndLastName[1][0] = "Tim ";
        firstAndLastName[1][1] = "Schildger";

        firstAndLastName[2][0] = "Finn ";
        firstAndLastName[2][1] = "Rothmann";

        firstAndLastName[3][0] = "Julian ";
        firstAndLastName[3][1] = "Ulbing";

        firstAndLastName[4][0] = "Marco ";
        firstAndLastName[4][1] = "Reus";

        // Äußere for-Schleife: Zeilenindex  => k
        // Innere for-Schleife: Spaltenindex => l

        for(int k = 0; k < firstAndLastName.length; k++) {
            for(int l = 0; l < firstAndLastName[k].length; l++) {
                System.out.print(firstAndLastName[k] [l]);
            }
            System.out.println();
        }

        //





    }

}