package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Check {
    public  static boolean SelectCheck(WebDriver webDriver, By locator){
         return webDriver.findElement(locator).isSelected();
    }

}
