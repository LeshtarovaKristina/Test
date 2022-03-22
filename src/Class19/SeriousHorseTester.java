package Class19;

public class SeriousHorseTester {
    public static void main(String[] args) {
        Horse horse=new Horse("Jacky",20,400);

        /*
        Horse->Data type(names of classes)
        horse->object/instance/reference variable/variable
        =    ->assignment operator
        Horse("Jacky",20,400)-> call to a constructor
        ; Line terminator
         */
        horse.setName("Jacky");
        horse.printHorseName();
    }
}
