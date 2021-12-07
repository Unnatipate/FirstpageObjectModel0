package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends BasePage {
    String browsername = "Chrome";
 //   public String browsername=System.getProperty("browser");


    public void openBrowser() {
        if (browsername.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browsername.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "src/test/java/drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        } else if (browsername.equalsIgnoreCase("I.E")) {
            System.setProperty("webdriver.I.E.driver", "src/test/java/drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        } else {
            System.out.println("your browser is wrong");
        }
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    public void closeBrowser(){
        driver.close();

    }


}