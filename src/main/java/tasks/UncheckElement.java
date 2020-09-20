package tasks;

import actions.Check;
import actions.Click;
import actions.WriteReport;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import ui.CheckboxesUI;

/**
 * Clase UncheckElement
 * 
 * @author Grupo 3 1. Cintia Melendrez Alaro 2. Fabiola Monrroy Vera 3. Giovanna
 *         Osinaga Terrazas 4. Gonzalo Osco Hernandez 5. Jhoseline Sharon
 *         Montenegro Pareja 6. Jorge Luis Mollericón García 7. Oscar Alejandro
 *         Parrado Ugarte 8. Raúl Rubén Pacheco Sandoval
 * @version 1.1
 **/

public class UncheckElement {
	/**
	 * Acciones
	 * metodo: ClickChecbox2
	 * @param WebDriver
	 */
    public static void ClickChecbox2(WebDriver driver){
    	WriteReport.rep(driver, Status.INFO, "deselect Check1");
        Click.on(driver, CheckboxesUI.checkbox2);
    }
	/**
	 * Acciones
	 * metodo: isUnSelectedCheck2
	 * @param WebDriver
	 * @return booelan
	 */
    public static boolean isUnSelectedCheck2(WebDriver driver){
    	WriteReport.rep(driver, Status.INFO, "deselect Check1 and Check2");
        return Check.SelectCheck(driver,CheckboxesUI.checkbox2);
    }
}
