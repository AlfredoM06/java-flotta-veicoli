package org.lessons.java.flotta;

public abstract class Veicolo {
    private String plate;
    private int year;

    public Veicolo(String plate, int year) {
        this.plate = plate;
        this.year = year;
    }

    public String getPlate() {
        return  plate;
    }

    public void setPlate(String Plate) {
        this.plate = Plate;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Targa: " + plate + ", Anno immatricolazione: " + year;
    }
}
