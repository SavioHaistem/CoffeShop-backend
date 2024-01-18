package entities;

import enums.Categories;

import java.util.ArrayList;

public class Product {
    private Double price;
    private Integer id;
    private ArrayList<Categories> categories = new ArrayList<>();

    public Product() {}
    public Product(Double price, Integer id, ArrayList<Categories> categories) {
        this.price = price;
        this.id = id;
        this.categories = categories;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ArrayList<Categories> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Categories> categories) {
        this.categories = categories;
    }
}
