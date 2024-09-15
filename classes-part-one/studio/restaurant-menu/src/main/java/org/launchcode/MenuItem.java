package org.launchcode;

import java.time.LocalDate;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private LocalDate currentDate;
    private LocalDate startDate;

    public MenuItem(double price, String description, String category, LocalDate startDate) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.startDate = startDate;
    }

    public double getPrice() {
        return price;
    };

    public String getCategory() {
        return category;
    };

    public String getDescription() {
        return description;
    };

    public LocalDate getCurrentDate() {
        return currentDate;
    };

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setCategory(String aCategory) {
        this.category = aCategory;
    };

    public void setDescription(String aDescription) {
        this.description = aDescription;
    }

    public void setPrice(double aPrice) {
        this.price = aPrice;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = LocalDate.now();
    }
}
