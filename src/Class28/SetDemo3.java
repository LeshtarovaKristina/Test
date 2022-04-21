package Class28;

import java.util.LinkedHashSet;

public class SetDemo3 {
    public static void main(String[] args) {
        LinkedHashSet<String> fruit=new LinkedHashSet<>();
        fruit.add("Z");
        fruit.add("A");
        fruit.add("B");
        fruit.add("G");
        fruit.add("D");
        fruit.add("Z");

        System.out.println(fruit);
    }
}
