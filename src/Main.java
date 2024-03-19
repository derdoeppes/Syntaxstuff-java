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

    boolean  test = true;
    System.out.println(test);

    double kommazahl = 2.3;
    System.out.println(kommazahl);

    //-------------------------------------------------------------------------//
        System.out.println("-------------------------------");
    //------------------------------------------------------------------------//
    // Klasse "string"
    // eine Klasse ist ein quasi  ein komplexer Datentyp (mehrere Wörter oder Zahlen)
    // Man kann auch eigene Klassen erstellen siehe weiter unten

    String animals  = "ape and dog";
    System.out.println(animals + " and cat" );



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

        if( age3 >= 18) {
            System.out.println("Du darfst das Computerspiel ab 18 spielen");
        }

    // es wird nicht ausgegeben weil nicht volljährig

    int age4 = 19;

        if(age4 >= 18) {
            System.out.println("Du darfst das Computerspiel ab 18 spielen");
        }

    // es wird ausgegeben weil volljährig


    int age5 = 17;

        if(age5 >= 18) {
            System.out.println("Du darfst das Computerspiel spielen");
        }
    else {
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

        switch(month1){
            case  1: System.out.println("Januar"); break;
            case  2: System.out.println("Februar"); break;
            case  3: System.out.println("März"); break;
            default: System.out.println("anderer Monat");
        }

    //simpel

    int month2 = 2;

        switch(month2){
            case 1, 2, 12 : System.out.println("Winter"); break;
            case 3, 4, 5  : System.out.println("Frühling"); break;
            case 6, 7, 8  : System.out.println("Sommer"); break;
            case 9, 10, 11: System.out.println("Herbst"); break;
            default       : System.out.println("Kein Monat");
        }

    //mehrere cases gleicher printout




    //-------------------------------------------------------------------------//
        System.out.println("-------------------------------");
    //-------------------------------------------------------------------------//


        








    }
}