package tasks;

import actions.Click;
import actions.Count;
import actions.Enter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ui.AddRemoveUI;
import ui.LoginUI;

public class AddElement {
    public static void add(WebDriver driver){
        Click.on(driver, AddRemoveUI.addElementButton);
    }
    public static int size(WebDriver driver) {
        return Count.elements(driver, AddRemoveUI.elements);
    }
}
