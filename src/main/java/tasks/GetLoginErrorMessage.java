package tasks;

import actions.GetText;
import org.openqa.selenium.WebDriver;
import ui.LoginUI;

public class GetLoginErrorMessage {
    public static String getText(WebDriver webDriver){
        return GetText.get(webDriver, LoginUI.errorLoginAlert);
    }
}
