package myJavaNotes.Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, Meal> menu = new HashMap<>();
        Meal beefBurger = new Meal(7.80, 500, Set.of("Bun", "Patty", "Sauce"));
        Meal cheeseBurger = new Meal(7.80, 500, Set.of("Bun", "Patty", "Sauce", "Cheese single"));

        menu.put("Beef Burger", beefBurger);
        menu.put("Cheese Burger", cheeseBurger);
        menu.put("Fries", new Meal(3.50, 250, Set.of("Potato", "Loads of oil")));
        menu.put("Pizza", new Meal(10.0, 750, Set.of("Dough", "Cheese", "Tomato", "Toppings")));

        Set<Meal> burgersTypes = new HashSet<>();
        burgersTypes.add(beefBurger);
        burgersTypes.add(cheeseBurger);
        System.out.println(burgersTypes);
        System.out.println(menu.keySet());
    }





}
