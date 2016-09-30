package ua.talab;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Ship titanic = new Ship("Titanic", 4000, 50000);
        System.out.println(titanic);
        System.out.println(titanic.getEngine());

        Ship.Engine newEngine = titanic.new Engine(55000);
        System.out.println(titanic);
        System.out.println(newEngine);

        titanic.setEngine(newEngine);
        System.out.println(titanic);

        Ship.Boat boat = new Ship.Boat(50, titanic);
        System.out.println(boat);
    }
}
