package be.ac.umons;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Margherita extends Pizza{
    public Margherita(String name){
        super(name = "Margherita");

        addIngredient(new Cheese("Cheese"));
    }
    /*public Margherita(BigDecimal price) {
        super (new BigDecimal(6.5);
    }*/

}
