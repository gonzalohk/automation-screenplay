package tasks;

import actions.GetText;
import org.openqa.selenium.WebDriver;
import ui.SecureUI;

public class GetLoginSuccessMessage {
    public static String getText(WebDriver webDriver){
        return GetText.get(webDriver, SecureUI.successLoginAlert);
    }
}
