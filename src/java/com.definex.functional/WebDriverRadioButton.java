import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebDriverRadioButton {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ErtugrulSen\\Desktop\\DFX\\DFX Testing Training-2022\\training-functional-test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\ErtugrulSen\\Desktop\\test-training folder\\training-functional-test\\src\\java\\webapplication\\RadioButton.html");

        List<WebElement> radioButton = driver.findElements(By.name("color"));
        radioButton.get(1).click();



    }
}
