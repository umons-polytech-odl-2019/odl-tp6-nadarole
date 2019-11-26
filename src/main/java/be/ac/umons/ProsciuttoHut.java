package be.ac.umons;

import java.math.BigDecimal;

public class ProsciuttoHut extends Prosciutto {
    public ProsciuttoHut(String name) {
        super("Prosciutto"+"hut");
        addIngredient(App.ingredients.get("Olive"));
        BigDecimal p =App.ingredients.get("Olive").getPrice();
        setPrice(p.add(super.getPrice()));
    }
}
