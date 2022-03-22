package Class25;

import sun.security.util.Length;

/*
Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute available methods.
 */
class Computer {
    String make;

    Computer(String make) {
        this.make = make;
    }

    void login() {
        System.out.println("Use username and password to login");
    }
}
    class Apple extends Computer{
       Apple(String make){
           super(make);
       }
       void login(){
           System.out.println("Use fingerprint to login as well");
       }
    }
class Lenovo extends Computer{
    Lenovo(String make){
        super(make);
    }
    void login(){
        System.out.println("Use windows Hello as well to login");
    }
}

class HP extends Computer{
    HP(String make){
        super(make);

    }
}

public class Task1 {
    public static void main(String[] args) {
        Lenovo lenovo=new Lenovo("Lenovo");
        lenovo.login();
        HP hp=new HP("HP");
        hp.login();
        Computer[] computers={new Lenovo("Lenovo"),new HP("HP"),new Apple("Apple")};
        for(Computer c:computers){
            c.login();
        }
    }
}
