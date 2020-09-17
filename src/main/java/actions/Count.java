package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ui.AddRemoveUI;

import java.util.List;

public class Count {
    public static int elements(WebDriver webDriver, By locator){
        List elements = webDriver.findElements(locator);
        return elements.size();
    }
}
