package org.example;

public class Auto extends Fahrzeug {

    protected int doors;

    public Auto() {
        super();
    }

    public Auto(String hersteller, String modell, int baujahr, int doors) {
        super(hersteller, modell, baujahr);
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "hersteller='" + hersteller + '\'' +
                ", modell='" + modell + '\'' +
                ", baujahr=" + baujahr +
                ", doors=" + doors +
                '}';
    }
}
