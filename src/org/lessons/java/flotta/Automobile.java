package org.lessons.java.flotta;

public class Automobile extends Veicolo{
    private int doors;

    public Automobile(String plate, int year, int doors) {
        super(plate, year);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
    @Override
    public String toString () {
         return "Auto (" + super.toString() + ", Numero di porte: " + doors + ")";
    }
}
