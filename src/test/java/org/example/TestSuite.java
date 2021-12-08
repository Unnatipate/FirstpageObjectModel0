package org.example;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationSuccessPage registrationSuccessPage = new RegistrationSuccessPage();

    //computer page
    ComputerPage computerPage = new ComputerPage();
    DesktopPage desktopPage = new DesktopPage();
    NewReleasePage newReleasePage = new NewReleasePage();

    //To refer a product to a friend
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    ProductEmailAFriendPage productEmailAFriendPage = new ProductEmailAFriendPage();
    EmailFriendSuceess emailFriendSuceess = new EmailFriendSuceess();

    @Test
    public void verifyUserShouldBeAbleToRegisterSuccessfully() {
        //click on register link
        homePage.clickonRegisterlink();
        //enter user details
        registrationPage.checkUserIsInRegisterPage();
        registrationPage.fillUserDetails();
        registrationPage.clickOnRegisterButton();
        registrationSuccessPage.verifyUserHasSuccesfullyRegisterd();


    }

    @Test
    public void verifyUserIsAbleToNavigateToTheDesktopPage() {
        homePage.clickOncomputerMenu();
        //check user is on the computer page
        computerPage.checkUserIsInTheComputerPage();
        //check pn desktop heading
        computerPage.clickonDesktopsHeading();
        desktopPage.checkuserIsInTheDesktopPage();
    }

    @Test
    public void userSholdbeabletoreferaprouct() {
        verifyUserShouldBeAbleToRegisterSuccessfully();
        homePage.clickOncomputerMenu();
        //check user is on the computer page
        computerPage.checkUserIsInTheComputerPage();
        //check pn desktop heading
        computerPage.clickonDesktopsHeading();
        desktopPage.userShouldBeAbleToClickOnAddToCartButton();
        buildYourOwnComputerPage.clickOnEmailAFriendButton();
        productEmailAFriendPage.verifyRegisteredUserCanReferAProductToFriend();
        emailFriendSuceess.userHasSuccessfullySentMessageToFriend();


    }

}
