package entities.lunchs;

import entities.Client;
import entities.Order;

public class Candy extends Order {
    private String name;

    public Candy(String name) {
        this.name = name;
    }

    public Candy(Client client, Integer id, Double price, String name) {
        super(client, id, price);
        this.name = name;
    }
}
