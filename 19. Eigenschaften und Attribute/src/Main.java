public class Main {                                                 // wir befinden uns hier in unserem Main Programm
    public static void main(String[] args) {

        // Eigenschaften und Attribute.
        // damit beschreibt man eine Klasse.
        // Sichtbarkeitsmodifizierer sind z.B. "public" oder "private",
        // ist dafür da um Klassen voneinander zu trennen

        Car car1 = new Car(); // Initalisierung eines neuen Objektes innerhalb unseres Main Programmes
        car1.drive();         // dies kann ausgeführt werden da die methode in der Klasse als public definiert ist.
        car1.color = "Gelb";  // auf color aus der Klasse kann nicht zugegriffen werden, da es color nur in der Klasse gibt und wir nur innerhalb der Klasse darauf zugreifen können!

        // Getter und Setter sind dazu da um trotz "private" KONTROLIERT auf die Eigenschaften zugreifen zu können
        // Sie werden innerhalb der Klasse als Methoden definiert

        car1.setHorsepower(650);                            //hier haben wir für car1 die Horsepower "setted"
        System.out.println(car1.getHorsepower());           // hier machen wir etwas und nehmen dafür "get"


     }

}