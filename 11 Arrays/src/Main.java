public class Main {
    public static void main(String[] args) {

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


        // String[] names3 = {"Justus", "Nils", "Lina"};      // festgelegte Reihenfolge wie die namen ausgegeben oben kann ich sie auch mit einer anderen Schleife z.B. Rückwärts ausgeben
        // automatisch Arraylänge drei
        // Unterschied Liste und Array
        /* Der Unterschied zwischen einer Liste und einem Array offenbart sich schon bei der Initialisierung/Deklarierung. Bei einem Array muss man schon vor dem Benutzen
           die genaue Länge angeben. Dies ist insofern unpraktisch, wenn man noch gar nicht weiß, wie groß das Array überhaupt wird. Diese Gedanken muss man sich bei einer Liste nicht machen,
           sie wächst einfach dynamisch mit. Damit ist das Vergrößern und auch das Verkleinern während der Laufzeit kein Problem. */

    }

}