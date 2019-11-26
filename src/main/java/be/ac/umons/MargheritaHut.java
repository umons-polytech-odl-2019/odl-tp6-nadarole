package be.ac.umons;

import java.math.BigDecimal;

public class MargheritaHut extends Margherita {
    public MargheritaHut(String name){
        super("Margherita"+"hut");
        addIngredient(App.ingredients.get("Olive"));
        BigDecimal p =App.ingredients.get("Olive").getPrice();
        setPrice(p.add(super.getPrice()));
    }
}
