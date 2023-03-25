package Challenges.catalogoNegozio;

import Challenges.catalogoNegozio.products.Article;
import Challenges.catalogoNegozio.products.ProductType;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Article article = new Article("Jassai", 2_500, ProductType.FOOTWEAR.getDescription(), ProductType.FOOTWEAR);
        Article article2 = new Article("Jassao", 3_000, ProductType.SLEEPWEAR.getDescription(), ProductType.SLEEPWEAR);
        Article article3 = new Article("Meravigliao", 1_000, ProductType.UNDERWEAR.getDescription(), ProductType.UNDERWEAR);
        Shop myShop = new Shop("Riot");
        myShop.addArticle(article);
        myShop.addArticle(article2);
        myShop.addArticle(article3);
        myShop.write("src/main/resources/myFile.txt");

    }

}
