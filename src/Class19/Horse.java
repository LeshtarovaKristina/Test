package Class19;

public class Horse {
    //It is very good practice to make the fields private
    private String name;
    private int age;
    private double weight;
    //No argument/zero argument constructor
    Horse(){
        /*
        write some important lines of code that you want to execute
        when the objest of a class is created for example
        you might want to fetch some info from internet or from your hard disk to give initial
        values to the fields
         */
    }
//purpose of constructor is to give initial values to the fields of a class
    Horse(String horseName,int horseAge,double horseWeight){
        name=horseName;
        age=horseAge;
        weight=horseWeight;
    }
    /*Rule1:
    constructors do not have return types like int String not even void
    void Horse(String horseName, int horseAge, double horseWeight){
    name=horseName;
    age=horseAge;
    weight=horseWeight;
    Rule2:
    name of the constructor should be the same as name of the class
     */

    void printHorseName(){
        System.out.println("Name "+name);
    }


void setName(String horseName){
    name=horseName;

}
}