package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NewReleasePage extends Utils{

    By _titleTextField=By.id("AddNewComment_CommentTitle");
    By _commentTextArea=By.id("AddNewComment_CommentText");
    By _addCommentButton=By.name("add comment");

    public void checkUserIsInTheNewReleasePage(){
        Assert.assertTrue(driver.getCurrentUrl().contains("nopcommerce-new-release"));
    }

    public void checkTheCommentIsPostSuccessfully(){
        String actualResult=getTextFromElement(By.xpath("//div@class=\"result\"]"));
        String expectedResult="News comment is successfully added";
        Assert.assertEquals(actualResult,expectedResult,"Error in posting the comment");
    }
    public void fillCommentSection(){
        //enter title
        typeText(_titleTextField,"New comment");
        //enter comment
        typeText(_commentTextArea,"comment Text");
        //click on add comment button
        clickonElement(_addCommentButton);
    }
}
