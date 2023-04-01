package Challenges.shopCatalog;

import Challenges.shopCatalog.products.Article;
import Challenges.shopCatalog.products.ProductType;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Article article1 = new Article("Jassai", 2_500, ProductType.FOOTWEAR);
        Article article2 = new Article("Jassao", 3_000, ProductType.SLEEPWEAR);
        Article article3 = new Article("Meravigliao", 1_000, ProductType.UNDERWEAR);
        Shop myShop = new Shop("Riot");
        myShop.addArticle(article1);
        myShop.addArticle(article2);
        myShop.addArticle(article2);
        myShop.addArticle(article3);
        myShop.addArticle(article3);
        myShop.addArticle(article3);

        myShop.saveCatalog("src/main/resources/myFile.csv");

        Shop rioter = new Shop("RioteR");
        rioter.loadCatalog("src/main/resources/myFile.csv");
        Article article4 = new Article("Teneshi", 30.00);
        Article article5 = new Article("Pijamask", 60.00);
        Article article6 = new Article("NightCap", 35.00);
        Article article7 = new Article("Socks", 12.00);

        rioter.addArticle(article4, article5, article6, article7);



        article4.applyDiscount(20.00);
        article5.applyDiscount(10.00);
        article6.applyDiscount(15.00);
        article4.calculateDiscountPrice();
        article5.calculateDiscountPrice();
        System.out.println("With this discount of " + article6.getDiscount()+ "% the Nightcap cost is just: " + article6.calculateDiscountPrice()+ "€ instead of: " + article6.getPrice()+ "€");
        rioter.getArticle("NightCap").setProductType(ProductType.SLEEPWEAR);
        rioter.getArticle("NightCap").printInfo();


        rioter.saveCatalog("src/main/resources/rioterCatalog.txt");
        rioter.loadCatalog("src/main/resources/rioterLoadedCatalog.txt");

        rioter.addArticle(article4);
        rioter.addArticle(article5);
        rioter.addArticle(article5);
        rioter.addArticle(article6);
        rioter.addArticle(article7);
        rioter.addArticle(article7);
        rioter.addArticle(article7);
        System.out.println(rioter.getCatalog());
        rioter.removeArticle(article7, article7);
        System.out.println(rioter.getCatalog());

        System.out.println(rioter.loadCatalog("src/main/resources/myFile.csv"));


    }

}
