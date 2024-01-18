package entities;

import java.util.ArrayList;

public class Table {
    private Integer id;
    private ArrayList<Client> clients = new ArrayList<>();
    

    public Table(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }
}