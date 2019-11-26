package be.ac.umons;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Pizza {
    private String  name;
    private BigDecimal price = new BigDecimal(0.0);
    protected ArrayList<Ingredient>listIngredients = new ArrayList<>();

    public Pizza(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    BigDecimal getPrice() {
        return price;
    }
    public void SetName(String n) {
        name =n;
    }
    public void setPrice (BigDecimal p){
        price=p;
    }

    public ArrayList<Ingredient> getListIngredients() {
        return listIngredients;
    }
    public void addIngredient (Ingredient i){
        listIngredients.add(i);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
