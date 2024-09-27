package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc{

    public CD(int capacity, String title, String typeOfDisk) {
        super(capacity, title, typeOfDisk);
    }

    @Override
    public void spinDisc() {
        System.out.println("The disk is spinning 10000 RPM");
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

    }

    @Override
    public void getDiskInfo() {

    }

    @Override
    public void playMedia() {

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
