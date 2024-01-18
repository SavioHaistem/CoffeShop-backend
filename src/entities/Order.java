package entities;

public abstract class Order {
    private Client client;
    private Integer id;
    private Double price;

    public Order() {}
    public Order(Client client, Integer id, Double price) {
        this.client = client;
        this.id = id;
        this.price = price;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Integer getId() {
        return id;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }
}