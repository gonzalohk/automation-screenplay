package tasks;

import actions.IsDisplayed;



import actions.WriteReport;


import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import ui.LoginUI;


/**
 * Clase mostrar pagina de Login
 * 
 * @author Grupo 3 1. Cintia Melendrez Alaro 2. Fabiola Monrroy Vera 3. Giovanna
 *         Osinaga Terrazas 4. Gonzalo Osco Hernandez 5. Jhoseline Sharon
 *         Montenegro Pareja 6. Jorge Luis Mollericón García 7. Oscar Alejandro
 *         Parrado Ugarte 8. Raúl Rubén Pacheco Sandoval
 * @version 1.1
 **/

public class IsLoginPageDisplayed {
	/**
	 * metodo: form
	 * @param WebDriver
	 * @return boolean
	 */
	public static boolean form(WebDriver webDriver){
    	WriteReport.rep(webDriver, Status.INFO, "Display Login");
        return IsDisplayed.element(webDriver, LoginUI.loginForm);
    }
}
