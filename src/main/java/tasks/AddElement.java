package tasks;

import actions.Click;
import actions.Count;
import actions.WriteReport;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import ui.AddRemoveUI;



/**
 * Clase para Adicionar y remover elementos
 * 
 * @author Grupo 3 1. Cintia Melendrez Alaro 2. Fabiola Monrroy Vera 3. Giovanna
 *         Osinaga Terrazas 4. Gonzalo Osco Hernandez 5. Jhoseline Sharon
 *         Montenegro Pareja 6. Jorge Luis Mollericón García 7. Oscar Alejandro
 *         Parrado Ugarte 8. Raúl Rubén Pacheco Sandoval
 * @version 1.1
 **/


public class AddElement {
	/**
	 * metodo: deleteButtons
	 * @param WebDriver
	 */
    public static void add(WebDriver driver){
    	WriteReport.rep(driver, Status.INFO, "Option Elements");
        Click.on(driver, AddRemoveUI.addElementButton);
    }
	/**
	 * metodo: deleteButtons
	 * @param WebDriver
	 * @return int
	 */
    public static int size(WebDriver driver) {
    	WriteReport.rep(driver, Status.INFO, "Add Elements");
        return Count.elements(driver, AddRemoveUI.elements);
    }
}
