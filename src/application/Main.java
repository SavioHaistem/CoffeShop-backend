package application;

import entities.Client;
import entities.lunchs.Coffe;
import enums.Ingredients;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Savio Haistem",1);
        ArrayList<Ingredients> ingredients = new ArrayList<>();
        ingredients.add(Ingredients.MILK);
        ingredients.add(Ingredients.SUGAR);
        Coffe coffe = new Coffe("Earth-coffe",client,1,1.5,1.0,ingredients);
        System.out.println(coffe);
    }
}
