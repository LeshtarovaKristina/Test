package Class31;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapsDemo3 {
    public static void main(String[] args) {
       HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 10.0);
        fruit.put("Orange", 15.0);

        HashMap<String, Double> vegetables = new HashMap<>();
        vegetables.put("Onion", 10.0);
        vegetables.put("Carrot", 15.0);
        ArrayList<HashMap<String,Double>> list=new ArrayList<>();
        list.add(fruit);
        list.add(vegetables);
        System.out.println(list);


    }
}
