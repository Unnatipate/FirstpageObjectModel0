package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductEmailAFriendPage extends Utils {
    By _friendEmail = By.id("FriendEmail");
    By _personalMessage = By.id("PersonalMessage");
    By _sendEmail = By.xpath("//button[@class=\"button-1 send-email-a-friend-button\"]");

    public void checkUserIsOnTheProductEmailAFriendPage() {
        Assert.assertTrue(driver.getCurrentUrl().contains("ProductEmailAFriend"));
    }
    public void checkEmailSentSuccesfully(){
        String actualresult=getTextFromElement(By.xpath("//div[@class=\"result\"])"));
        String expectedResult="Your message has been sent";

        Assert.assertEquals(actualresult,expectedResult,"unable to refer a product");
    }
    public void verifyRegisteredUserCanReferAProductToFriend(){
        //Input Friends Email
        typeText(_friendEmail,"xyz+" +getCurrentTimeStamp() + "@gmail.com");
        //Input your email address
        // typeText(By.id("YourEmailAddress"),"unnatip145@gmail.com");
        //Input Personal Message
        typeText(_personalMessage,"Awesome Product!!!");
        //click send email Button
        clickonElement(_sendEmail);





    }
}
