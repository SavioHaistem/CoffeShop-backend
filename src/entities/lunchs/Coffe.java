package entities.lunchs;

import entities.Client;
import entities.Order;
import enums.Ingredients;

import java.util.ArrayList;

public class Coffe extends Order {
    private String name;
    private ArrayList<Ingredients> ingredients;
    private Double quantity;

    public Coffe(ArrayList<Ingredients> ingredients, Double quantity, String name) {
        this.ingredients = ingredients;
        this.name = name;
        this.quantity = quantity;
    }

    public Coffe(String name,Client client, Integer id, Double price, Double quantity, ArrayList<Ingredients> ingredients) {
        super(client, id, price);
        this.ingredients = ingredients;
        this.quantity = quantity;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder coffeLog = new StringBuilder();
        coffeLog.append(this.getName()).append(": \n");
        coffeLog.append("Ingredients: ").append(this.getIngredients()).append('\n');
        coffeLog.append("Quantity: ").append(this.getQuantity()).append(" ml").append('\n');
        coffeLog.append("Price: ").append(this.getPrice()).append('\n');
        return coffeLog.toString();
    }
}
