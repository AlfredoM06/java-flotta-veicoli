package org.lessons.java.flotta;

public class Motocicletta extends Veicolo{
    private boolean stand;

    public Motocicletta(String plate, int year, boolean stand) {
        super(plate, year);
        this.stand = stand;
    }

    public boolean isStand() {
        return stand;
    }

    public void setStand(boolean stand) {
        this.stand = stand;
    }
    @Override
    public String toString () {
        return "Motocicletta (" + super.toString() + ", " + (stand ? " con cavalleto: " : "senza cavalletto");
    }
}
