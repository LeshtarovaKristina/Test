package Class17;

public class HealthyDog {
      //when the information is expected to be different from object to object
    // we store that information in an instance variable

        String name;// INSTANCE
        String color;//INSTANCE
        static int numberOfLegs;//STATIC
        void eat(){
            int noOfTimes=3;//LOCAL
            System.out.println(name+" eat "+noOfTimes);
        }
        public static void main(String[]args){
            HealthyDog dog=new HealthyDog();//local

            dog.name="scooby";
            dog.color="Pink";
            HealthyDog.numberOfLegs=4;
            dog.eat();

            HealthyDog dog2=new HealthyDog();
            dog2.name="tomy";
            dog2.color="Navy blue";
            HealthyDog.numberOfLegs=4;
            dog2.eat();


    }
    }


