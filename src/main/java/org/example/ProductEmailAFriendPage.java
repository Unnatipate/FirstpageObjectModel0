package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductEmailAFriendPage extends Utils {
    By _friendemailTextBox=By.id("friendEmail");
    By _messageTextArea=By.id("PersonalMessage");
    By _sendemail=By.name("Send email");

    public void checkUserIsOnTheProductEmailAFriendPage() {
        Assert.assertTrue(driver.getCurrentUrl().contains("productemailafriend"));
    }
    public void checkEmailsentSuccesfully(){
        String actualresult=getTextFromElement(By.xpath("//div[@class=\"result\"])"));
        String expectedResult="Your message has been sent";

        Assert.assertEquals(actualresult,expectedResult,"unable to refer a product");
    }
    public void fillEmailAFriendForm(){
        typeText(_friendemailTextBox,"xyz@gmail.com");
        typeText(_messageTextArea,"check this Nice Product");
        clickonElement(_sendemail);





    }
}
