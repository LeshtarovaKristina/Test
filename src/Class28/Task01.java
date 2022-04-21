package Class28;

import java.util.ArrayList;
import java.util.Iterator;

/*
Create an arraylist of cars and retrieve all the values using 3 different ways.
 */
public class Task01 {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Porsche");

        System.out.println(cars);//1st way
        for(String car:cars){
            System.out.println(car);//2nd way
        }
for(int i=0; i<cars.size(); i++){
    System.out.println(cars.get(i));
}
    int i=0;
    while(i<cars.size()){
        System.out.println(cars.get(i));
        i++;                              //3rd way
    }
    Iterator<String> iterator= cars.iterator();
    while(iterator.hasNext()){
        System.out.println(iterator.hasNext());//4th way
    }
    }
}
