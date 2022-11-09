package org.example.UserRegistration;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner sc = new Scanner(System.in);
    public static void validateFirstName() {
        System.out.println("Enter First name ");
        String first_name = sc.nextLine();
        String firstNamePattern = "[A-Z]{1}[a-z,A-Z]{2,}";
        Pattern pattern = Pattern.compile(firstNamePattern);
        Matcher matcher = pattern.matcher(first_name);
        if (matcher.matches()) {
            System.out.println("Entered Name is Valid");
        } else {
            System.out.println("Entered Name is Invalid");
        }
    }
    public static void validateLastName() {
        System.out.println("Enter Last name ");
        String last_name = sc.nextLine();
        String lastNamePattern = "^[A-Z]{1}[a-z,A-Z]{2,}";
        Pattern pattern = Pattern.compile(lastNamePattern);
        Matcher matcher = pattern.matcher(last_name);
        if (matcher.matches()) {
            System.out.println("Entered Name is Valid");
        } else {
            System.out.println("Entered Name is Not Valid");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Project ");
        validateFirstName();
        validateLastName();
    }
}
