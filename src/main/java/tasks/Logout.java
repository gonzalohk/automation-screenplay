package tasks;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.LoginUI;
import ui.SecureUI;

public class Logout {
    public static void onClick(WebDriver driver){
        Click.on(driver, SecureUI.logoutButton);
    }
}
