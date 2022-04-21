package Class28;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo3 {
    public static void main(String[] args) {
        List<String> courses = new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual tasting");
        courses.add("Java");
        courses.add("Git");
        courses.add("Selenium");
        Iterator<String> iterator=courses.iterator();
        while( iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}