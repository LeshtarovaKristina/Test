package Class31;

import java.util.LinkedHashSet;

/*
Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
 */
public class Task2 {
    public static void main(String[] args) {
        LinkedHashSet<String> drinks=new LinkedHashSet<>();
        drinks.add("Coke");
        drinks.add("Vodka(Astaffirullah)");
        drinks.add("tequila(Astaffirullah)");
        drinks.add("margarita(Astaffirullah)");
        drinks.add("Link");
        StringBuilder allDrinks=new StringBuilder();
        for(String drink:drinks){
            allDrinks.append(drink).append(" ");
        }
        System.out.println(allDrinks);
    }
}
