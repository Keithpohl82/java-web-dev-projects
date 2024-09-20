package org.launchcode;
import java.time.LocalDate;
import java.util.Date;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Date today = new Date();
        MenuItem banana = new MenuItem(0.99, "Dec", "Fruit", true);
        ArrayList<MenuItem> itemList = new ArrayList<>();
        itemList.add(banana);



        Menu testMenu = new Menu(today,itemList);
        testMenu.setItems(itemList);
//        ArrayList<MenuItem> testlist = testMenu.getItems();
        System.out.print(testMenu.getItems().get(0));


    }
}
