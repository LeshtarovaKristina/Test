package Class28;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo2 {
    public static void main(String[] args) {
        List<String> courses = new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual tasting");
        courses.add("Java");
        courses.add("Git");
        courses.add("Selenium");

        Iterator<String> itretor=courses.iterator();

        System.out.println(  itretor.hasNext());
        System.out.println(  itretor.next());
        System.out.println(  itretor.hasNext());
        System.out.println(  itretor.next());
        System.out.println(  itretor.hasNext());
        System.out.println(  itretor.next());
        System.out.println(  itretor.hasNext());
        System.out.println(  itretor.next());
        System.out.println(  itretor.hasNext());
        System.out.println(  itretor.next());
        System.out.println(  itretor.hasNext());
    }
}