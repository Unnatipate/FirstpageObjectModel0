package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class DesktopPage extends Utils{
    By _buildyourownComputerlink=By.linkText("Build your own computer");
    By _addToCartButton = By.xpath("//div[@class=\"item-grid\"]/div[1]/div/div[2]/div[3]/div[2]/button[@class=\"button-2 product-box-add-to-cart-button\"]");
    public void checkuserIsInTheDesktopPage()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("desktop"));
    }
    public void clickOnAProduct()
    {clickonElement(_buildyourownComputerlink);

    }
    public void userShouldBeAbleToClickOnAddToCartButton()
    {
        //click on add to chart button
        clickonElement(_addToCartButton);

    }
}
