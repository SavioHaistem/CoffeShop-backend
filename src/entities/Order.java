package entities;

public class Order {
    private Client client;
    private Integer id;

    public Order() {}
    public Order(Client client, Integer id) {
        this.client = client;
        this.id = id;
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
}