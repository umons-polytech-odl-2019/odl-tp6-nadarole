package be.ac.umons;

import java.math.BigDecimal;
import java.util.ListIterator;

public class Prosciutto extends Pizza {
    public Prosciutto(String name) {
        super("Prosciuto");

        addIngredient(new Ham());
        addIngredient(new Cheese());
        addIngredient(new TomatoSauce());
        addIngredient(new Dough());
        ListIterator<Ingredient> it = listIngredients.listIterator();
        BigDecimal p =new BigDecimal(0.0);
        while (it.hasNext()) {
            p.add(it.next().getPrice()); // c comme ci on faisiat p=p+it.getprice()
        }
        setPrice(p);
    }
}
