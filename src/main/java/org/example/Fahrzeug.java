package org.example;

public class Fahrzeug {

    protected String hersteller;
    protected String modell;
    protected int baujahr;

    public Fahrzeug() {

    }

    public Fahrzeug(String hersteller, String modell, int baujahr) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.baujahr = baujahr;
    }

    @Override
    public String toString() {
        return "Fahrzeug{" +
                "hersteller='" + hersteller + '\'' +
                ", modell='" + modell + '\'' +
                ", baujahr='" + baujahr + '\'' +
                '}';
    }
}
