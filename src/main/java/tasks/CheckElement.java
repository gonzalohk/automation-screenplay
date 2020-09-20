package tasks;

import actions.Check;
import actions.Click;
import actions.WriteReport;
import helper.ScreenShotHelper;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import ui.CheckboxesUI;
import ui.ListElementsUI;

/**
 * Clase para click de elementos
 * 
 * @author Grupo 3 1. Cintia Melendrez Alaro 2. Fabiola Monrroy Vera 3. Giovanna
 *         Osinaga Terrazas 4. Gonzalo Osco Hernandez 5. Jhoseline Sharon
 *         Montenegro Pareja 6. Jorge Luis Mollericón García 7. Oscar Alejandro
 *         Parrado Ugarte 8. Raúl Rubén Pacheco Sandoval
 * @version 1.1
 **/

public class CheckElement {
	/**
	 * metodo: CheckboxLink
	 * @param WebDriver
	 */
	public static void CheckboxLink(WebDriver driver) {
		WriteReport.rep(driver, Status.INFO, "Click Check");
		Click.on(driver, ListElementsUI.checkboxOption);
	}
	/**
	 * metodo: ClickChecbox1
	 * @param WebDriver
	 */
	public static void ClickChecbox1(WebDriver driver) {
		WriteReport.rep(driver, Status.INFO, "select a check");
		Click.on(driver, CheckboxesUI.checkbox1);

	}
	/**
	 * metodo: isSelectedCheck1
	 * @param Check.SelectCheck
	 */
	public static boolean isSelectedCheck1(WebDriver driver) {
		WriteReport.rep(driver, Status.INFO,"check selection 1 and two");
		return Check.SelectCheck(driver, CheckboxesUI.checkbox1);
	}
}
