package entities.lunchs;

import entities.Order;
import enums.Ingredients;

import java.util.ArrayList;

public class Coffe extends Order {
    private ArrayList<Ingredients> ingredients;
    private Double quantity;

    public Coffe(ArrayList<Ingredients> ingredients, Double quantity) {
        this.ingredients = ingredients;
        this.quantity = quantity;
    }

    public Coffe(String name, Integer id, Double price, Double quantity, ArrayList<Ingredients> ingredients) {
        super(name, id, price);
        this.ingredients = ingredients;
        this.quantity = quantity;
    }

    public ArrayList<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        StringBuilder coffeLog = new StringBuilder();
        coffeLog.append(this.getName()).append(": \n");
        coffeLog.append("Ingredients: ").append(this.getIngredients()).append('\n');
        coffeLog.append("Quantity: ").append(this.getQuantity()).append('\n');
        coffeLog.append("Price: ").append(this.getPrice()).append('\n');
        return coffeLog.toString();
    }
}
