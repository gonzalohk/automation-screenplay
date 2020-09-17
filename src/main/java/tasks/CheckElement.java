package tasks;

import org.openqa.selenium.WebDriver;

public void CheckboxLink(WebDriver driver){
        Click.on(driver, ListElementsUI.checkboxOption);
    }

    public static void ClickChecbox1(WebDriver driver){
        Click.on(driver, CheckboxesUI.checkbox1);

    }
    public static boolean isSelectedCheck1(WebDriver driver){
         return Check.SelectCheck(driver,CheckboxesUI.checkbox1);
    }
}
