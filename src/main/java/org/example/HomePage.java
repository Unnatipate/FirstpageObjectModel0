package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {


        By _registerlink = By.linkText("Register");
        By _computerMenu =By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[1]/a");
        By _detailsButton = By.xpath("//div[@class=\"buttons\"]a[@href=\"\nopcommerce-new-release\"]");

        public void clickonRegisterlink(){
            clickonElement(_registerlink);
        }
        public void clickOncomputerMenu(){
            clickonElement(_computerMenu);
        }
        public void ClickonRegisterButton(){
            clickonElement(_detailsButton);
    }


}


