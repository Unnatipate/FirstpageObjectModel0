package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationSuccessPage extends Utils{
    public void verifyUserIsOnRegisterSuccessPage(){
        Assert.assertTrue(driver.getCurrentUrl().contains(""));

    }
    public void verifyUserHasSuccesfullyRegisterd(){
        String expectedResult="Your Registration completed";
        String actualResult=getTextFromElement(By.xpath("//div[@class=\"result\"]"));
        Assert.assertEquals(actualResult,expectedResult,"Registration failed");
    }
}