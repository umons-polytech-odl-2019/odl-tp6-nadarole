package be.ac.umons;

import java.math.BigDecimal;

public class Carbonarahut extends Carbonara {
    public  Carbonarahut(String name){
        super("Carbonara"+"hut");
        addIngredient(App.ingredients.get("Olive"));
        BigDecimal p =App.ingredients.get("Olive").getPrice();
        setPrice(p.add(super.getPrice()));
    }
}
