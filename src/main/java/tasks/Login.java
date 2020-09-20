package tasks;

import actions.Click;
import actions.Enter;
import actions.WriteReport;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import ui.LoginUI;


/**
 * Clase Login
 * 
 * @author Grupo 3 1. Cintia Melendrez Alaro 2. Fabiola Monrroy Vera 3. Giovanna
 *         Osinaga Terrazas 4. Gonzalo Osco Hernandez 5. Jhoseline Sharon
 *         Montenegro Pareja 6. Jorge Luis Mollericón García 7. Oscar Alejandro
 *         Parrado Ugarte 8. Raúl Rubén Pacheco Sandoval
 * @version 1.1
 **/


public class Login {
	
	/**
	 * Acciones
	 * metodo: as
	 * @param WebDriver, String user, String passWord
	 * @return boolean
	 */
    public static void as(WebDriver driver, String user, String passWord){
        Enter.text(driver, LoginUI.userInput, user);
        Enter.text(driver, LoginUI.passWordInput, passWord);        
        Click.on(driver, LoginUI.loginButton);        
    }
}
