package Challenges.shopCatalog;

import Challenges.shopCatalog.products.Article;
import Challenges.shopCatalog.products.ProductType;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Shop {
    //fields
    private String name;
    private HashMap<Article, Integer> catalog;

    //Constructors

    /***
     * Inizializza una mappa nuova vuota
     * @param name della mappa
     */
    public Shop(String name) {
        this.name = name;
        this.catalog = new HashMap<>();
    }

    /***
     * Used with the method that loads the catalog from the file
     * @param name of the shop
     * @param catalog list of articles
     */

    public Shop(String name, HashMap<Article, Integer> catalog) {
        this.name = name;
        this.catalog = catalog;
    }

    //Getters
    public String getName() {
        return name;
    }

    public HashMap<Article, Integer> getCatalog() {
        return catalog;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCatalog(HashMap<Article, Integer> catalog) {
        this.catalog = catalog;
    }

    /***
     * This method adds one or more articles to the catalog
     * @param articles to add to the catalog
     */
    public void addArticle(Article ... articles) {
        for (Article article : articles){
            if (catalog.containsKey(article)) {
                catalog.put(article, catalog.get(article) + 1);
            } else {
                catalog.put(article, 1);
            }
        }


    }

    /***
     * Removes an article from the catalog
     * @param articles to remove
     */

    public void removeArticle(Article...articles) {
        for(Article article : articles){
            if (catalog.get(article) > 1) {
                catalog.put(article, catalog.get(article) - 1);
            } else {
                catalog.remove(article);
            }
        }
    }

    /***
     * This method takes as input the name of an article and
     * returns the corresponding article if it exists else,
     * throws an exception error
     * @param name of the article to find
     * @return the corresponding article
     */

    public Article getArticle(String name) {
        /*for(Map.Entry<Article, Integer> entry : catalog.entrySet()){
            if(entry.getKey().getName().equals(name)){
                return entry.getKey();
            }
        }*/

        for (Article article : catalog.keySet()) {
            if (article.getName().equals(name)) {
                return article;
            }
        }
        //Launching the exception I avoid to return anything
        throw new NullPointerException("Article not found: " + name);
    }

    /***
     * Applies discount for the type of the product passed to it
     * @param productType of product to apply discount to
     * @param discount to apply
     */

    public void applyDiscountForType(ProductType productType, double discount) {
       /* for(Map.Entry<Article, Integer> entry : catalog.entrySet()){
            if(entry.getKey().getType().equals(productType)){            //  As I don't need the quantity here I can just use
                entry.getKey().applyDiscount(discount);                  // the if(Article article: catalog.keySet()){} format.
            }
        }*/
        for (Article article : catalog.keySet()) {
            if (article.getType().equals(productType)) {
                article.applyDiscount(discount);
            }
        }
    }


//    public void saveCatalogFile(String catalogFile){
//
//        File file= new File(catalogFile);
//        try {
//            FileReader fileReader = new FileReader(catalogFile);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            while(bufferedReader.ready()){
//                String line = bufferedReader.readLine();
//                System.out.println(line);
//            }
//            bufferedReader.close();
//            } catch (FileNotFoundException ex) {
//            throw new RuntimeException(ex);
//            } catch (IOException ex) {
//            throw new RuntimeException(ex);
//            }
//
//    }

    public void saveCatalog(String pathName) throws IOException {
        File file = new File(pathName);

        FileWriter writer = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Article, Integer> entry : catalog.entrySet()) {
            sb.append(entry.getKey());
            sb.append(",");
            sb.append(entry.getValue());
            sb.append(System.getProperty("line.separator"));
        }
        bufferedWriter.write(sb.toString());
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    //Finish writing this method that loads the catalog from a file
    public Shop loadCatalog(String pathName) throws IOException {
        File file = new File(pathName);
        BufferedReader br = new BufferedReader(new FileReader(file));
        HashMap<Article, Integer> inventory = new HashMap<>();

        while (br.ready()) {
            String line = br.readLine();
            String[] parts = line.split(",");
            String typeArticle = parts[2];
            ProductType tp;
            switch (typeArticle) {
                case "UNDERWEAR":
                    tp = ProductType.UNDERWEAR;
                    break;
                case "FOOTWEAR":
                    tp = ProductType.FOOTWEAR;
                    break;
                case "SLEEPWEAR":
                    tp = ProductType.SLEEPWEAR;
                    break;
                default:
                    throw new IllegalArgumentException("Unknown type " + typeArticle);
            }
            Article lineArticle = new Article(parts[0], Double.valueOf(parts[1]), tp);
            inventory.put(lineArticle, Integer.valueOf(parts[3]));
        }

        Shop riotoso = new Shop("Riotoso", inventory);
        return riotoso;
    }


    @Override
    public String toString() {
        return "Shop name: " + name + "\n" + "Catalogo: \n" + catalog;
    }
}
