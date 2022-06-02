import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverSelecteItem {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ErtugrulSen\\Desktop\\DFX\\DFX Testing Training-2022\\training-functional-test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\ErtugrulSen\\Desktop\\test-training folder\\training-functional-test\\src\\java\\webapplication\\SelectedItem.html");

        WebElement selectElement = driver.findElement(By.id("select1"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("Maybe");
    }
}
