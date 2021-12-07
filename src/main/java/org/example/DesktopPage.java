package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class DesktopPage extends Utils{

    By _buildyourownComputerlink=By.linkText("Build your own computer");

    public void checkuserIsInTheDesktopPage()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("desktop"));

    }
    public void clickOnAProduct()
    {
        clickonElement(_buildyourownComputerlink);

    }
}
