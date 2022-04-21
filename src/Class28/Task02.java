package Class28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/*
Create an arrayList of words. Remove every word that ends with “e”.
 */
public class Task02 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Love");
        arrayList.add("Lahore");
        arrayList.add("cake");

        //arraylist.removeIf(s-> s.toLowerCase().endsWith("e"));
       Iterator<String> iterator=arrayList.iterator();
       while(iterator.hasNext()){
           if(iterator.next().toLowerCase().endsWith("e")){
               iterator.remove();
           }
       }
        System.out.println(arrayList);
    }
}
