package tasks;

import org.openqa.selenium.WebDriver;

public class UncheckElement {
    public static void ClickChecbox2(WebDriver driver){
        Click.on(driver, CheckboxesUI.checkbox2);
    }
    public static boolean isUnSelectedCheck2(WebDriver driver){
        return Check.SelectCheck(driver,CheckboxesUI.checkbox2);
    }
}
