package be.ac.umons;

import java.math.BigDecimal;

public class FruttiDiMareHut extends FruttiDiMare {

        public FruttiDiMareHut(String name) {
            super("FruttiDiMare"+"hut");
            addIngredient(App.ingredients.get("Olive"));
            BigDecimal p =App.ingredients.get("Olive").getPrice();
            setPrice(p.add(super.getPrice()));
        }

}
