package application;

import entities.lunchs.Coffe;
import enums.Categories;
import enums.Ingredients;

import java.util.ArrayList;
import java.util.Scanner;

public class Ui {
    private ArrayList<Coffe> coffes = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void buildCoffe() {
        String coffName = scan.nextLine();
        Double coffPrice = scan.nextDouble();
        Integer coffId = (coffes.size() + 1);
        Double coffQuantity = scan.nextDouble();
        scan.nextLine();
        Categories categorie = Categories.valueOf(scan.nextLine());
        Ingredients ingredients = Ingredients.valueOf(scan.nextLine());
        Coffe coffe = new Coffe(coffPrice,coffId,coffName,coffQuantity);
        coffe.addIngredients(Ingredients.CHOCOLATE);
        coffe.addCategorie(Categories.COFFE);
    }
}
