package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD testCD = new CD(2345, "thing", "CD");
        DVD testDVD = new DVD(4000, "random", "A large DVD Movie");
        testCD.spinDisc();
        testCD.getCapacity();
        testDVD.getDiskInfo();
        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}