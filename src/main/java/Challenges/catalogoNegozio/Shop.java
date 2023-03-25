package Challenges.catalogoNegozio;

import Challenges.catalogoNegozio.products.Article;
import Challenges.catalogoNegozio.products.ProductType;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Shop {
    private final String name;
    private Map<Article, Integer> catalog;

    public Shop(String name) {
        this.name = name;
        this.catalog = new HashMap<>();
    }

    public void addArticle(Article article) {
        if(catalog.containsKey(article)){
            catalog.put(article,catalog.get(article) +1);
        }else{
            catalog.put(article, 1);
        }

    }

    public void removeArticle(Article article) {
        if(catalog.get(article)>1){
            catalog.put(article,catalog.get(article) -1);
        }else{
            catalog.remove(article);
        };
    }

    public Article getArticle(String name){
        for(Map.Entry<Article, Integer> entry : catalog.entrySet()){
            if(entry.getKey().getName().equals(name)){
                return entry.getKey();
            }
        }
        System.out.println("Article not found: " + name);
        return null;
    }

    public void applyDiscountForType(ProductType productType, double discount){
        for(Map.Entry<Article, Integer> entry : catalog.entrySet()){
            if(entry.getKey().getType().equals(productType)){
                entry.getKey().applyDiscount(discount);
            }
        }
    }



    public void saveCatalogFile(String catalogFile){

        File file= new File("catalogFile");
        try {
            FileReader fileReader = new FileReader(catalogFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while(bufferedReader.ready()){
                String line = bufferedReader.readLine();
                System.out.println(line);
            }
            bufferedReader.close();
            } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
            } catch (IOException ex) {
            throw new RuntimeException(ex);
            }

    }

    public void write(String pathName) throws IOException {
        File file = new File(pathName);

        FileWriter writer = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Article, Integer> entry : catalog.entrySet()) {
            sb.append(entry.getKey());
            sb.append(",");
            sb.append(entry.getValue());
            sb.append(System.getProperty("line.separator"));


        }
        bufferedWriter.write(sb.toString());
        bufferedWriter.flush();
        bufferedWriter.close();
    }


//    public HashMap<Article, Integer> loadCatalog(String pathName) throws IOException {
//        File file = new File(pathName);
//        BufferedReader bufferedReader= new BufferedReader(new FileReader(file));
//        while(bufferedReader.ready()){
//            String line = bufferedReader.readLine();
//            System.out.println(line);
//        }
//        return HashMap<Article, Integer>;
//    }


}
