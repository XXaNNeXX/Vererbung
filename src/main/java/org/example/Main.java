package org.example;

public class Main {
    public static void main(String[] args) {

        Fahrzeug fahrzeug = new Fahrzeug("Ford", "Fiesta", 2000);
        System.out.println(fahrzeug);

        Auto auto = new Auto("Hyundai", "i10", 2010, 2);
        System.out.println(auto);

        Motorrad motorrad = new Motorrad("XYZ", "M1", 1999, 345, "");
        motorrad.setArt("Chopper");
        System.out.println(motorrad);
    }
}