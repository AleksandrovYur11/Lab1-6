package org.Itmo.java.lesson6.Task3;

public class Main {
    public static void main(String[] args) {
        Car volvo = new Car(1345, "XC60", 'R', 200);
        volvo.outPut();
        System.out.println("");
        Truck man = new Truck(4000, "TGX", 'W', 180, 8, 12000);
        man.newWheels(10);
        man.outPut();
    }
}
