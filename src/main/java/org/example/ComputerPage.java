package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ComputerPage extends Utils{
    By _desktopHeading=By.xpath("//h2/a[href=\"desktops\"]");

    public void checkUserIsInTheComputerPage()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("computers"));

    }
    public void clickonDesktopsHeading(){
        //click on desktop page
        clickonElement(_desktopHeading);
    }
}
