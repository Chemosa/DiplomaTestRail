package UI.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Button {
    WebDriver driver;
    String label;

    public Button(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public Button clickButton() {
        driver.findElement(By.id(label)).click();
        return this;
    }
}
