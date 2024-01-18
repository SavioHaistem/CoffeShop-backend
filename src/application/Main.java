package application;

import entities.lunchs.Coffe;
import enums.Ingredients;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ingredients> ingredients = new ArrayList<>();
        ingredients.add(Ingredients.MILK);
        ingredients.add(Ingredients.SUGAR);
        Coffe coffe = new Coffe("Earths Coffe",1,2.0,1.0,ingredients);
        System.out.println(coffe);
    }
}
