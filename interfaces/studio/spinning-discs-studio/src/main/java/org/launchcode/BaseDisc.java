package org.launchcode;

public abstract class BaseDisc {
    public BaseDisc(int capacity, String title, String typeOfDisk) {
        this.capacity = capacity;
        this.title = title;
        this.typeOfDisk = typeOfDisk;
    }

    int capacity;
    String title;
    String typeOfDisk;
    int rpm;
}
