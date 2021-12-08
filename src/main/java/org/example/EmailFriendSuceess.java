package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailFriendSuceess extends Utils{
    By _messageSentSuccessReferAProduct = By.xpath("//div[@class=\"page email-a-friend-page\"]/div[2]/div[2]");

    public void userHasSuccessfullySentMessageToFriend(){
        // Verifying the message sent success
        String actualRegisterCompletionMessage = getTextFromElement(_messageSentSuccessReferAProduct);
        String expectedRegisterCompletedMessage = "Your message has been sent.";
        Assert.assertTrue(actualRegisterCompletionMessage.equals(expectedRegisterCompletedMessage),"User is on correct page");

    }

}
