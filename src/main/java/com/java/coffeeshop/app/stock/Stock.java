package com.java.coffeeshop.app.stock;

public abstract class Stock {

    protected String id;
    protected String name;
    protected String price;
    protected String category;
    protected String ammount;
    protected boolean available;
    protected String error;
    protected String total;

    Stock() {

    }

    public boolean isAvailable() {

        return this.available;

    }

    public void setError(String error) {

        this.error = error;

    }

    public String getError() {

        return this.error;
    }

    public String getAvaibility() {

        if (!this.isAvailable()) {

            return "" + this.print();

        } else {

            return "";

        }

    }

    public void setTotal(String total) {

        this.total = total;

    }

    public String getTotal() {

        return this.total;
    }

    public void setId(String id) {

        this.id = id;

    }

    public String getId() {

        return this.id;
    }

    public void setName(String name) {

        this.name = name;

    }

    public String getName() {

        return this.name;

    }

    public void setPrice(String price) {

        this.price = price;

    }

    public String getPrice() {

        return this.price;

    }

    public void setCategory(String category) {

        this.category = category;

    }

    public String getCategory() {

        return this.category;

    }

    public void setAmmount(String ammount) {

        this.ammount = ammount;

    }

    public String getAmmount() {

        return this.ammount;

    }

    public String print() {

        return "Id: " + "\nNome: " + this.getName() + "\nPreço: R$" + this.getPrice() + "\nCategoria: "
                + this.getCategory() + "\nQuantidade: " + this.getAmmount();

    }

}
