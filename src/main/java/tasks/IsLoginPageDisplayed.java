package tasks;

import actions.IsDisplayed;
import org.openqa.selenium.WebDriver;
import ui.LoginUI;

public class IsLoginPageDisplayed {
    public static boolean form(WebDriver webDriver){
        return IsDisplayed.element(webDriver, LoginUI.loginForm);
    }
}
