public class Main {
    public static void main(String[] args) {

    // gibt Methoden mit und ohne Rückgabewert
    // die methode kann ich überall im Programm aufrufen nur mit dem Namen

    System.out.println("Vor dem Methodenaufruf");
    DoSomething();                                          //wenn ich das Programm starte wird von oben nach unten alles ausgeführt
    System.out.println("Nach dem Methodenaufruf");          // println ist auch eine methode die automatisch vordefiniert ist. wir müssen aber Parameter zuweisen
    System.out.println("Zweite Methode:");
    DoSomething2(10, 20);

    }
    public static void DoSomething() {                      // Methodenkopf
        int x = 10;                                         // ab hier Methodenblock
        int y = 20;
        int result = x + y;
        System.out.println(result);
    }





    public static void DoSomething2(int number1, int number2 ) {        // hier noch mal die gleiche Methode aber wir weisen in der main Methode schon zwei Werte zu
        int a = number1;
        int b = number2;
        int result2 =  a + b;
        System.out.println(result2);

    }
}