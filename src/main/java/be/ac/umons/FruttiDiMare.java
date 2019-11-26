package be.ac.umons;

import java.math.BigDecimal;
import java.util.*;

public class FruttiDiMare extends Pizza {
    public FruttiDiMare(String name){

        super("FruttiDiMare");
        addIngredient(new Cheese());
        addIngredient(new TomatoSauce());
        addIngredient(new Dough());
        addIngredient(new Seafood());
        ListIterator<Ingredient> it = listIngredients.listIterator();
        BigDecimal p =new BigDecimal(0.0);
        while (it.hasNext()) {
            p.add(it.next().getPrice()); // c comme ci on faisiat p=p+it.getprice()
        }
    }
}
