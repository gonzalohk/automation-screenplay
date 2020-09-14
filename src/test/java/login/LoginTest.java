package login;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tasks.Login;

public class LoginTest extends BaseTest {
    @BeforeMethod
    public void init(){
         webDriver.get(URL + "login");
    }

    @Test
    public void testSuccessfulLogin(){
        Login.as(webDriver,"tomsmith","SuperSecretPassword!");
        //TODO ADD Logic
        Assert.assertEquals("test", "test");
    }

   @Test
    public void testInvalidCredentials(){
        //TODO ADD Logic
        Assert.assertEquals("test", "test");
    }

    @Test
    public void testLogOut(){
        //TODO ADD Logic
        Assert.assertTrue(true);
    }
}