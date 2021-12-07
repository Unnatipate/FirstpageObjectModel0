package org.example;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest{
    HomePage homePage=new HomePage();
    RegistrationPage registrationPage=new RegistrationPage();


    @Test
    public void verifyUserShouldBeAbleToRegisterSuccesfully(){
        //click on register link
        homePage.ClickonRegisterButton();
        //enter user details
        registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.userEntersRegistrtionDetails();


    }
    @Test
    public void userShouldbeableToReferaProducttoFriend(){
        verifyUserShouldBeAbleToRegisterSuccesfully();
    }
}
