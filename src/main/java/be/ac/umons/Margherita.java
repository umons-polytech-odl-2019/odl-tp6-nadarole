package be.ac.umons;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.ListIterator;

public class Margherita extends Pizza{
    public Margherita(String name){
        super("Margherita");

        addIngredient(new Cheese());
        addIngredient(new TomatoSauce());
        addIngredient(new Dough());
        ListIterator<Ingredient> it = listIngredients.listIterator();
        BigDecimal p =new BigDecimal(0.0);
        while (it.hasNext()) {
            p.add(it.next().getPrice()); // c comme ci on faisiat p=p+it.getprice()
        }
    }
    /*public Margherita(BigDecimal price) {
        super (new BigDecimal(6.5);
    }*/

}
