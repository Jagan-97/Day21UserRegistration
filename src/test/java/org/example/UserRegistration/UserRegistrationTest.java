package org.example.UserRegistration;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userValidation = new UserRegistration();
    @Test
    public void firstNameValidation_WithSplChar_ShouldFail() {
        try {
            userValidation.firstNameValidation("Jagan");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void lastNameValidation_WithNumeric_ShouldFail() {
        try {
            userValidation.validateLastName("1234");
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }
    @Test
    public void EmailValidation_WithoutDomain_ShouldFail() {
        try {
            userValidation.validateEmail("abc.com");
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }
    @Test
    public void phoneNumberValidation_WhenShort_ShouldFail() {
        try {
            userValidation.validatePhoneNumber("98765");
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }
    @Test
    public void phoneNumberValidation_WithoutCountryCode_ShouldFail() {
        try {
            userValidation.validatePhoneNumber("9087654321");
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }
    @Test
    public void passwordValidation_WithoutUpperCase_ShouldFail() {
        try {
            userValidation.validatePassword("jagan06@97");
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }
    @Test
    public void passwordValidation_WithoutNumeric_ShouldFail() {
        try {
            userValidation.validatePassword("jagan0611");
        }catch (UserRegistrationException e){
            e.printStackTrace();
        }
    }

}