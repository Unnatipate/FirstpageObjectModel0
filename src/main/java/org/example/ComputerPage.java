package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ComputerPage extends Utils{
    By _desktopHeading=By.xpath("//div[@class=\"item-grid\"]/div[1]/div/h2/a");

    public void checkUserIsInTheComputerPage()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("computers"));

    }
    public void clickonDesktopsHeading(){
        //click on desktop page
        clickonElement(_desktopHeading);
    }
}
