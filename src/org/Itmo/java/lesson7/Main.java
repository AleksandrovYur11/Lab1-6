package org.Itmo.java.lesson7;

public class Main {
    public static void main(String[] args) {
        Plane AircraftPushkin = new Plane("A350", "A.C Pushkin");
        AircraftPushkin.getWing().setWeight(45D);
        AircraftPushkin.planeShowInfo();

        Plane AircraftRonaldo = new Plane("A380", "C.R. Ronaldo");
        AircraftRonaldo.getWing().setWeight(60.5D);
        AircraftRonaldo.planeShowInfo();
    }
}
