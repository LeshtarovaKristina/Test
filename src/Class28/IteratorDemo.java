package Class28;

import java.util.LinkedList;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> courses=new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual tasting");
        courses.add("Java");
        courses.add("Git");
        courses.add("Selenium");
       /* for(int i=0;i<5;i++){
            if(courses.get(i).equals("Java"));
            courses.remove("Java");
        }*/
        for(String course:courses){
            if(course.equals("Java")){
                courses.remove(course);
            }
        }
    }
}
