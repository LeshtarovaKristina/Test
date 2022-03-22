package Class16;

public class StringVsStringBuilder {
    public static void main(String[]args){
        String s="Asghar Is Great";
        System.out.println(s.replace(" ",""));
        System.out.println(s);
        s.concat("hahah");

        StringBuilder stringBuilder=new StringBuilder("Asghar Is Great");

        System.out.println(stringBuilder.reverse());

        stringBuilder.append("Hahaha");
        System.out.println(stringBuilder);

        boolean flag=true;

        if(!flag||flag){

        }
    }
}
