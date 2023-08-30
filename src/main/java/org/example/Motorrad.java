package org.example;

public class Motorrad extends Fahrzeug {

    int hubraum;
    String art;

    public Motorrad(String hersteller, String modell, int baujahr, int hubraum, String art) {
        super(hersteller, modell, baujahr);
        this.hubraum = hubraum;
        this.art = art;
    }

    public int getHubraum() {
        return hubraum;
    }

    public void setHubraum(int hubraum) {
        this.hubraum = hubraum;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    @Override
    public String toString() {
        return "Motorrad{" +
                "hersteller='" + hersteller + '\'' +
                ", modell='" + modell + '\'' +
                ", baujahr=" + baujahr +
                ", hubraum=" + hubraum +
                ", art='" + art + '\'' +
                '}';
    }


}
