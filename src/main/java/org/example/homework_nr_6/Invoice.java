package org.example.homework_nr_6;

public class Invoice {

    String model;
    String description;
    private Integer quantity;
    private Double price;

    public Invoice(String model, String description, Integer quantity, Double price) {
        this.model = model;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        if (quantity > 0)
        this.quantity = quantity;
        else this.quantity = 0;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price > 0) this.price = price;
        else this.price = 0.0;
    }

    public double getAmount(){
       return price * quantity;

    }

}
