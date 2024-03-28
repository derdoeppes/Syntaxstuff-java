public class Main {
    public static void main(String[] args) {

 
        //Verschachtelte Schleifen


        for (int j = 1; j < 4; j++) {                  // hier weiß ich das ich 3 mal die Schleife durchlaufen lassen möchte (1 bis 4 ist gleich 3)

            for (int p = 1; p < 4; p++) {                 // nicht auch j benennen
                System.out.print("[ ] ");               // Unterschied zu println ist, dass kein Zeilenumbruch nach Befehl getätigt wird
            }
            System.out.println();                       // damit nach "p-Schleife" Zeilenumbruch bevor wieder in i Schleife Sprung
        }

    }

}