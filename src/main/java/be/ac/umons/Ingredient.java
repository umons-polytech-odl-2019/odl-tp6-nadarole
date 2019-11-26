package be.ac.umons;

import java.math.BigDecimal;

public class Ingredient implements PizzaComponent {

    private String name;
    private BigDecimal price;

    public Ingredient() {
        //on en a besoin de constructeur sans parametre dans app
    }
    public Ingredient(String name,BigDecimal price){
        name=this.name;
        price=this.price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
