package Challenges.catalogoNegozio;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private final String name;
    private final List<Article> catalog;

    public Shop(String name) {
        this.name = name;
        this.catalog = new ArrayList<>();
    }

    public void addArticle(Article article) {
        catalog.add(article);
    }

    public void removeArticle(Article article) {
        catalog.remove(article);
    }

    public Article getArticle(String name){
        for(Article article : catalog){
            if(article.getName().equals(name)){
                return article;
            }
        }
        return null;
    }

    public void applyDiscountForType(ProductType productType,double discount){
        for(Article article : catalog){
            if(article.getType().equals(productType)){
                article.setDiscount(discount);
                article.applyDiscount();
            }
        }
    }

    public void saveCatalogFile(String catalogFile){
 //       File myCatalogFile = new File(..);

    }


}
