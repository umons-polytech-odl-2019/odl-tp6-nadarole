package be.ac.umons;

import java.math.BigDecimal;
import java.util.ListIterator;

public class Carbonara extends Pizza {
    public Carbonara(String name) {
        super("Carbonara");
        addIngredient(new Cheese());
        addIngredient(new WhiteCream());
        addIngredient(new Dough());
        addIngredient(new Ham());
        ListIterator<Ingredient> it = listIngredients.listIterator();
        BigDecimal p =new BigDecimal(0.0);
        while (it.hasNext()) {
            p.add(it.next().getPrice()); // c comme ci on faisiat p=p+it.getprice()
        }
    }
}