package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationSuccessPage extends Utils{
   // public void verifyUserIsOnRegisterSuccessPage(){
     //   Assert.assertTrue(driver.getCurrentUrl().contains("verifyUserIsOnRegisterSuccessPage"));

   // }
    public void verifyUserHasSuccesfullyRegisterd(){
        String expectedResult="Your registration completed";
        String actualResult=getTextFromElement(By.xpath("//div[@class=\"result\"]"));
        Assert.assertEquals(actualResult,expectedResult,"Registration failed");
    }
}
