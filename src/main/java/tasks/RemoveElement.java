package tasks;

import actions.Click;
import actions.Count;
import org.openqa.selenium.WebDriver;
import ui.AddRemoveUI;

public class RemoveElement {
    public static void remove(WebDriver driver){
        Click.on(driver, AddRemoveUI.removeElementButton);
    }
    public static int size(WebDriver driver) {
        return Count.elements(driver, AddRemoveUI.elements);
    }
}
