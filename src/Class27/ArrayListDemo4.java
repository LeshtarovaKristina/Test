package Class27;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");

        ArrayList<String> vegitables=new ArrayList<>();
        vegitables.add("Potato");
        vegitables.add("Onion");
        vegitables.add("Carrot");

        ArrayList<String> groceries=new ArrayList<>();
        groceries.addAll(fruits);
        groceries.addAll(vegitables);
        System.out.println(groceries);
    }
}
