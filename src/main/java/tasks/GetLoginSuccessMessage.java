package tasks;

import actions.GetText;
import org.openqa.selenium.WebDriver;
import ui.SecureUI;


/**
 * Clase para Mensaje del Login
 * 
 * @author Grupo 3 1. Cintia Melendrez Alaro 2. Fabiola Monrroy Vera 3. Giovanna
 *         Osinaga Terrazas 4. Gonzalo Osco Hernandez 5. Jhoseline Sharon
 *         Montenegro Pareja 6. Jorge Luis Mollericón García 7. Oscar Alejandro
 *         Parrado Ugarte 8. Raúl Rubén Pacheco Sandoval
 * @version 1.1
 **/

public class GetLoginSuccessMessage {
	
	/**
	 * metodo: getText
	 * @param WebDriver
	 * @return GetText
	 */
    public static String getText(WebDriver webDriver){
        return GetText.get(webDriver, SecureUI.successLoginAlert);
    }
}
