package login;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tasks.*;

public class LoginTest extends BaseTest {
    @BeforeMethod
    public void init(){
         webDriver.get(URL + "login");
    }

   @Test
    public void testSuccessfulLogin(){
        Login.as(webDriver,"tomsmith","SuperSecretPassword!");
        Assert.assertTrue(IsVisibleLoginSuccessMessage.visible(webDriver),"Login success message was shown");
        Assert.assertEquals(GetLoginSuccessMessage.getText(webDriver),"You logged into a secure area!\n×");
    }

   @Test
    public void testInvalidCredentials(){
        Login.as(webDriver, "tomsmith", "WrongPassword!");
        Assert.assertTrue(IsVisibleLoginErrorMessage.visible(webDriver),"Login error message was shown");
        Assert.assertEquals(GetLoginErrorMessage.getText(webDriver),"Your password is invalid!\n×");
    }

    @Test
    public void testLogOut(){
        Login.as(webDriver,"tomsmith","SuperSecretPassword!");
        Logout.onClick(webDriver);
        Assert.assertTrue(IsLoginPageDisplayed.form(webDriver));
    }
}