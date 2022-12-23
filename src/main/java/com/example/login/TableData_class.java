package com.example.login;

public class TableData_class {
    int id;
    String name;
    int quantity;
    double price;

    public TableData_class() {
        this.id = 0;
        this.name = "";
        this.quantity = 0;
        this.price = 0.0;
    }
    public TableData_class(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return

                "\t"+ name  +
                "\t\t" + quantity +
                "\t\t" + price+"\n";
    }

}
