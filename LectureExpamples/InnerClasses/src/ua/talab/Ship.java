package ua.talab;

/**
 * Created by Vladyslav_Shkola on 9/28/2016.
 */
public class Ship {
    private String name;
    private int tonnage;
    private Engine engine;

    public class Engine{
        private int hp;
        private String name;

        public Engine(int hp) {
            this.hp = hp;
        }

        @Override
        public String toString() {
            return "Engine of ship " + Ship.this.name +
                    Ship.super.toString() +
                    " hp=" + hp +
                    '}';
        }

        public int getHp() {
            return hp;
        }
    }

    public static class Boat{
        private int capacity;
        private Ship ship;

        public Boat(int capacity, Ship ship) {
            this.ship = ship;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return "Boat{ Ship name = " +  ship.name +
                    ", capacity=" + capacity +
                    '}';
        }
    }



    public Ship(String name, int tonnage, int hp) {
        this.name = name;
        this.tonnage = tonnage;
        this.engine = new Engine(hp);
        this.engine.hp++;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", tonnage=" + tonnage +
                " engine = " + engine +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public String getName() {
        return name;
    }

    public int getTonnage() {
        return tonnage;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
