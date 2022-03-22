package Class18;

public class AccessModifierTester {
    public static void main(String[] args) {
        AccessModifiers am =new AccessModifiers();
        /*
        can not access as name , because it has private access
         */
        //System.out.println(am.name);
        System.out.println(am.age);
        System.out.println(am.weight);
        System.out.println(am.color);

    }
}
