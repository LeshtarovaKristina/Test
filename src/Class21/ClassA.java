package Class21;

public class ClassA {
    void method(){
        System.out.println("A");
    }
}
class ClassB extends ClassA {
    void method() {
        System.out.println("B");
    }
    void test(){
        method();//calls the same class mathod
        this.method();//calls the same class mathod
        super.method();//calls the same class mathod

    }
}
class Tester {
    public static void main(String[] args) {
        ClassB classB=new ClassB();
        classB.test();
    }
}