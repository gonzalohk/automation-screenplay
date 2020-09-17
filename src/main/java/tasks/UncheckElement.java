package tasks;

import actions.Check;
import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.CheckboxesUI;

public class UncheckElement {
    public static void ClickChecbox2(WebDriver driver){
        Click.on(driver, CheckboxesUI.checkbox2);
    }
    public static boolean isUnSelectedCheck2(WebDriver driver){
        return Check.SelectCheck(driver,CheckboxesUI.checkbox2);
    }
}
