package entities;

public abstract class Order {
    private String name;
    private Integer id;
    private Double price;

    public Order() {}
    public Order(String name, Integer id, Double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public Double getPrice() {
        return price;
    }
}