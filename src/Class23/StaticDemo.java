package Class23;

public class StaticDemo {

}
class Cat{
    static int NoOfLegs=4;
    String name;
    Cat(String name){
        this.name=name;
    }

    public void printInfo(){
        System.out.println(name+NoOfLegs);
    }
    public static void Print(){
        //we can not access the instance fields directly inside static methods
        //System.out.println(name+NoOfLegs);-> we can not use instance fields with static methods!!!!
    }

    public static void main(String[] args) {
        Cat cat=new Cat("Stella");
        Cat.Print();

        Cat cat2=new Cat("Nella");
        Cat.Print();
    }
}
