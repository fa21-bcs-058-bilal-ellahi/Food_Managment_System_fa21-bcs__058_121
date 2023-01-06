package com.example.login;

public class TableData_class {
    int id;
    String name;
    int quantity;
    double price;

    int invoice;

    public TableData_class() {
        this.id = 0;
        this.name = "";
        this.quantity = 0;
        this.price = 0.0;
        this.invoice = 0;
    }
    public TableData_class(String name) {
        this();
        this.name = name;
    }


    public TableData_class(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = Double.parseDouble(String.format("%.2f",price));
        this.invoice = invoice;

    }

    public int getInvoice() {
        return invoice;
    }

    public void setInvoice(int invoice) {
        this.invoice = invoice;
    }

    public TableData_class(int id, String name, int quantity, double price, int invoice) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = Double.parseDouble(String.format("%.2f",price));
        this.invoice = invoice;

    }  public TableData_class( int invoice) {
        this();
        this.invoice = invoice;

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

        return Double.parseDouble(String.format("%.2f",price));
    }

    public void setPrice(Double price) {

        this.price = Double.parseDouble(String.format("%.2f",price));
    }

    @Override
    public String toString() {
        return

                "\t"+ name  +
                "\t\t" + quantity +
                "\t\t" + String.format("%.2f",price)+"\n";
    }


    @Override
    public boolean equals(Object p) {
        if(p instanceof TableData_class t)
            return t.getName().equals(this.name);
        return false;
    }

}
