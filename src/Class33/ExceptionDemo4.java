package Class33;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        try {
            System.out.println("1");
            System.out.println(10 / 0);
            System.out.println("2");
        }catch(ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            //e.printStackTrace();
        }
        System.out.println("4");
    }
}
