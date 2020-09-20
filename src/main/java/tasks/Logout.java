package tasks;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.LoginUI;
import ui.SecureUI;


/**
 * Clase Logout
 * 
 * @author Grupo 3 1. Cintia Melendrez Alaro 2. Fabiola Monrroy Vera 3. Giovanna
 *         Osinaga Terrazas 4. Gonzalo Osco Hernandez 5. Jhoseline Sharon
 *         Montenegro Pareja 6. Jorge Luis Mollericón García 7. Oscar Alejandro
 *         Parrado Ugarte 8. Raúl Rubén Pacheco Sandoval
 * @version 1.1
 **/

public class Logout {
	/**
	 * Acciones
	 * metodo: onClick
	 * @param WebDriver 
	 * @return boolean
	 */
    public static void onClick(WebDriver driver){
        Click.on(driver, SecureUI.logoutButton);
    }
}
