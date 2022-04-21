package Class33;
public class DoSomething {
    void DoSomething(int a, int b) {
        Calculator calculator = new Calculator();
        calculator.DoTheMath(a,b);
    }

    public static void main(String[] args) {
        DoSomething doSomething = new DoSomething();
        doSomething.DoSomething(10,10);
        // getting 20 and 1 cuz of the math class + and / in math class
    }
}