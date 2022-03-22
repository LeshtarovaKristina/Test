package Class25;
public interface MoveAble {
    void move();
}
interface  driveAble{
    void drive();
}
interface Car extends driveAble,MoveAble{

}
class BMW implements Car {
    public void move() {System.out.println("we can move the BMW");}
    public void drive() {System.out.println("we can drive the BMW");}
}
class CarTester_1{
    public static void main(String[] args) {
        driveAble driveAble = new BMW();
        driveAble.drive();
    }
}










