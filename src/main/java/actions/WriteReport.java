package actions;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import helper.ScreenShotHelper;

public class WriteReport {
	
	public static void rep(WebDriver driver, Status status, String details ) {
		ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver, status, details);
	}

}
