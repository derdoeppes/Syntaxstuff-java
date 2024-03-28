public class Car {

    // Eigenschaften
    private String color;
    private String brand;
    private int horsepower;


    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    // Methoden
    public void drive() {

        System.out.println("Das Auto fährt");

    }
}
