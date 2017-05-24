/**
 * Created by Dave on 5/24/17.
 */
public class User {
    // this class represents a user "object"

    private String phoneNumber;
    private int age;
    private String email;
    private String password;


    // constructor
    User (int age, String email, String password) {
        this.age = age;
        this.email = email;
        this.password = password;
    }

    // another constructor
    User(int age, String email, String password, String phoneNumber) {
        this.age = age;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    // we need to "get" variables out of the object

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return  email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // setters to change / update values

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "The user is " + age + " years old. Their email address is " + email
                + " and their password is " + password;
    }
}

