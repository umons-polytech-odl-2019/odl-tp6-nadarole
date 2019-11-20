package be.ac.umons;

import java.math.BigDecimal;

public interface PizzaComponent {
    public abstract String getName(); //ce sont des prototypes
    public abstract BigDecimal getPrice();
    public abstract void setName(String n);
    public abstract void setPrice (BigDecimal p);
    public abstract  String toString();

}
