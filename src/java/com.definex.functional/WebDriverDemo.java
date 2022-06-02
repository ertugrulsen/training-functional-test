
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriverDemo {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ErtugrulSen\\Desktop\\DFX\\DFX Testing Training-2022\\training-functional-test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        WebElement searchField = driver.findElement(By.name("q"));
        searchField.click();
        searchField.sendKeys("definex");
        searchField.sendKeys((Keys.ENTER));

        WebElement imageLink = driver.findElements(By.linkText("Görseller")).get(0);
        imageLink.click();
        WebElement imageElement = driver.findElement(By.xpath("//*[@id=\'islrg\']/div[1]/div[1]/a[1]/div[1]/img"));
        imageElement.click();
        driver.close();
    }
}
