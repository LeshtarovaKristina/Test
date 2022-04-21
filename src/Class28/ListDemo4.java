package Class28;

import java.util.LinkedList;

public class ListDemo4 {
    public static void main(String[] args) {

        Student teyfur=new Student("Teyfur",20,"Memes");
        Student peter=new Student("Petar",23,"Talking too much!");
        Student milos=new Student("Milos",31,"Lazy");
        LinkedList<Student> studentLinkedList=new LinkedList<>();
        studentLinkedList.add(teyfur);
        studentLinkedList.add(peter);
        studentLinkedList.add(milos);
        System.out.println(studentLinkedList);
    }
}
class Student{
    public Student(String name, int age, String hobbies){
        this.name=name;
        this.age=age;
        this.hobbies=hobbies;
    }
    String name;
    int age;
    String hobbies;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies='" + hobbies + '\'' +
                '}';
    }
}