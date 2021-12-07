package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegistrationPage extends Utils{
    static By _genderFemaleRadioButton=By.id("gender-female");
    static By _firstname=By.id("Firstname");
    static By _lastname=By.id("Lastname");
    static By _email=By.id("Email");
    static By _newsletterCheckbox=By.id("Newsletter");
    static By _password=By.id("Password");
    static By _confirmpassword=By.id("ConfirmPassword");
    static By _clickonRegisterButton=By.id("register_button");

    //check if user is in register page
    public static void enterRegistrationDetails() {
        Assert.assertTrue(driver.getCurrentUrl().contains("register"));
    }
    public void fillUserDetails() {
        //click on female radio button
        clickonElement(_genderFemaleRadioButton);
        //Enter firstname
        typeText(_firstname, "Unnati");
        //write user last name
        typeText(_lastname, "Patel");
        //select  date of birth
        Select selectday = new Select(driver.findElement(By.name("Date of Birthday")));
        selectday.selectByValue("14");
        //select date of birth month
        Select selectmonth = new Select(driver.findElement(By.name("Date of Month")));
        selectmonth.selectByVisibleText("May");
        //select date of birth year
        Select selectyear = new Select(driver.findElement(By.name("Date of Birthyear")));
        selectyear.selectByVisibleText("1991");
        //enter email
        String email = "unnatip145" + getCurrentTimeStamp() + "gmail.com";
        typeText(_email, email);
        //Deselect newsletter checkbox
        clickonElement(_newsletterCheckbox);
        //enter user password
        typeText(_password, "Unnati145");
        //enter user confirm password
        typeText(_confirmpassword, "Unnati145");

    }
    public void clickOnRegisterButton(){
        //click on register button
       // waitforclickable(By.id("register-button"),20);
        clickonElement(_clickonRegisterButton);






    }


    public void verifyUserIsOnRegisterPage() {
    }

    public void userEntersRegistrtionDetails() {
    }
}






