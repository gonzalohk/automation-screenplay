package ui;

import org.openqa.selenium.By;

public class AddRemoveUI {
    public static By addElementButton = By.xpath("//*[@id=\"content\"]/div/button");
    public static By removeElementButton = By.xpath("//*[@id=\"elements\"]/button");
    public static By elements = By.cssSelector("#elements .added-manually");
}
