/**
 * Created by Dave on 5/24/17.
 */

import java.util.*;

public class Tester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your email: ");
        String email = scanner.nextLine();

        System.out.println("Enter a password: ");
        String password = scanner.nextLine();

        System.out.println("Enter your password again....");
        String confirmPassword = scanner.nextLine();

        if (password.equals(confirmPassword)) {
            // create a user
            User ray = new User(age, email, password);
            System.out.println(ray.toString());

            ray.setAge(35);
            ray.setEmail("rayIsOldNow@yahoo.com");
            ray.setPassword("newPassword");
            System.out.println(ray.toString());
        }

        else {
            System.out.println("Passwords don't match");
        }
    }
}
