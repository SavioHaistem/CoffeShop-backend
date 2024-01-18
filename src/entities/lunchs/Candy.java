package entities.lunchs;
import entities.Product;
import enums.Categories;

import java.util.ArrayList;

public class Candy extends Product {
    private String name;

    public Candy(String name) {
        this.name = name;
    }

    public Candy(Double price, Integer id, ArrayList<Categories> categories, String name) {
        super(price, id, categories);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
