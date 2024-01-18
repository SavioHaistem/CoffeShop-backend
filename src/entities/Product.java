package entities;

import enums.Categories;

import java.util.ArrayList;

public class Product {
    private Double price;
    private Integer id;
    private ArrayList<Categories> categories = new ArrayList<>();

    public Product() {}
    public Product(Double price, Integer id) {
        this.price = price;
        this.id = id;
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

    public void addCategorie(Categories categorie) {
        this.categories.add(categorie);
    }
}
