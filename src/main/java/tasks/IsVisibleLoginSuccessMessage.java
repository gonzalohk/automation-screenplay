package tasks;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.LoginUI;
import ui.SecureUI;

public class IsVisibleLoginSuccessMessage {
    public static boolean visible(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver, SecureUI.successLoginAlert);
    }
}
