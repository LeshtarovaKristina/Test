package Class24;

public class Parent {
    final String name="Vladlen";
    final void method(){
        //name="Mr. A"; we can not reassign if a variable is final
        System.out.println("I am parent");
    }
    void method2(){

    }
}
class Child extends Parent{
    /*void method(){
        CAN NOT OVERRIDE THIS,BECAUSE IT IS A FINAL METHOD!!!
    }  */

}