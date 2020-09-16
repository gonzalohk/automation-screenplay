package ui;

import org.openqa.selenium.By;

public class LoginUI {
    //TODO ADD Locators
    public static By userInput = By.id("username");
    public static By passWordInput = By.id("password");
    public static By loginButton = By.xpath("//*[@id=\"login\"]/button");
    public static By loginForm = By.id("login");
    public static By errorLoginAlert = By.id("flash");
}
