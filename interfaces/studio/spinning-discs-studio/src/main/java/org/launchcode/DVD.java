package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc{

    public DVD(int capacity, String title, String typeOfDisk) {
        super(capacity, title, typeOfDisk);
    }

    @Override
    public void spinDisc() {
        System.out.println("The disk is spinning" + capacity + "RPM");
    }

    @Override
    public void getCapacity() {

        System.out.println("Capacity is " + capacity);
    }

    @Override
    public void writeToDisk() {

    }

    @Override
    public void readFromDisk() {

        capacity = 3000;
    }

    @Override
    public void getDiskInfo() {
        getCapacity();

        System.out.println("Title is " + title);
    }

    @Override
    public void playMedia() {
    System.out.println("We are going to start the Movie!!!!! YAAAA");
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
