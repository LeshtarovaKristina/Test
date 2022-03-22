package Class23;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

public class DogTester {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog);
        Dog dog2=new Dog("Tommy","Green","Redball",12,25.5);
       dog2.changeInfo("Rocky","Black");
        System.out.println(dog2);
}
}
