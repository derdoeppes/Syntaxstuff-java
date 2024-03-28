public class Main {
    public static void main(String[] args) {

         // Methoden mit Rückgabewert.
         // Rückgabewert ist das Ergebnis der Methode.


        System.out.println("Vor dem Methodenaufruf");                                        // hier ist die Methode noch nicht im Programm aufgerufen
        int ResultFromMethodeDoSomething = DoSomething(30, 50);                              // ab hier kann ein meine Methode im restlichen Main Programm verwenden davor existiert sie aber nicht
                                                                                             // hier könnte ich mit Println und meinem neuen "int" meine Methode ausgeben oder auch damit rechnen oder so
        System.out.println("Nach dem Methodenaufruf");


    }

    public static int DoSomething(int number1, int number2 ) {

        int result = number1 + number2;
        return result;

    }
}

