package Class28;

import java.util.ArrayList;

/*
Create an arrayList of drinks.
If any drink has letter “a” or “e” replace it with water.
 */
public class Task03 {
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Coke");
        drinks.add("Tea");
        drinks.add("Coffee");
        drinks.add("aloevera");
        drinks.add("Milk");

        for(int i=0; i<drinks.size(); i++){
            if(drinks.get(i).contains("a")||drinks.get(i).contains("e")){
                drinks.set(i,"Water");
            }
        }
        System.out.println(drinks);
    }
}
