package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegistrationPage extends Utils{
     By _genderFemaleRadioButton=By.id("gender-female");
     By _firstnameField=By.id("FirstName");
     By _lastnameField=By.id("LastName");
     By _emailField=By.id("Email");
     By _newsletterCheckbox=By.id("Newsletter");
     By _passwordField=By.id("Password");
     By _confirmPasswordField= By.id("ConfirmPassword");
      By _clickonRegisterButton=By.id("register-button");

    //check if user is in register page
    public static void checkUserIsInRegisterPage() {

        Assert.assertTrue(driver.getCurrentUrl().contains("register"));
    }
    public void fillUserDetails() {
        //click on female radio button
        clickonElement(_genderFemaleRadioButton);
        //Enter firstname
        typeText(_firstnameField, "Unnati");
        //write user last name
        typeText(_lastnameField, "Patel");
        //select  date of birth
        Select selectday = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")));
        selectday.selectByValue("14");
        //select date of birth month
        Select selectmonth = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")));
        selectmonth.selectByVisibleText("May");
        //select date of birth year
        Select selectyear = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")));
        selectyear.selectByVisibleText("1991");
        //enter email
        String email = "unnatip145" + getCurrentTimeStamp() + "@gmail.com";
        typeText(_emailField, email);
        //Deselect newsletter checkbox
        clickonElement(_newsletterCheckbox);
        //enter user password
        typeText(_passwordField, "Unnati145");
        //enter user confirm password
        typeText(_confirmPasswordField, "Unnati145");

    }
    public void clickOnRegisterButton(){
        //click on register button
       // waitforclickable(By.id("register-button"),20);
        clickonElement(_clickonRegisterButton);
    }

}






