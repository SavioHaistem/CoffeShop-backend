package entities.lunchs;
import entities.Product;
import enums.Categories;
import enums.Ingredients;
import java.util.ArrayList;


public class Coffe extends Product {
    private String name;
    private ArrayList<Ingredients> ingredients;
    private Double quantity;

    public Coffe() {}

    public Coffe(Double price, Integer id, String name, Double quantity) {
        super(price, id);
        this.name = name;
        this.quantity = quantity;
    }

    public ArrayList<Ingredients> getIngredients() {
        return ingredients;
    }

    public void addIngredients(Ingredients ingredient) {
        this.ingredients.add(ingredient);
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
