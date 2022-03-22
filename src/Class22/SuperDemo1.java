package Class22;

public class SuperDemo1 {
}
class AAA{

}
class BBB{
    String name;

    BBB(){

    }
    BBB(String name){
        super();
        //this(); we can not use THIS() and SUPER() inside the same constructor

        this.name=name;
    }
}