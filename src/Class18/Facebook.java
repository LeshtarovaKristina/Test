package Class18;

public class Facebook {
    private String userName;
    private String password;
    private int age;

    void setAge(int personAge) {
        if (age > 13 && age < 120) {
            age = personAge;
        } else {
            System.out.println("Not " + "not allowed it is not a Horse");
        }
    }

    int getAge(String userPassword) {
        //protecting the age with a password
        if (userPassword.equals(password)) {
            return age;
        } else {
            return -1;
        }
    }
}