import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {
    public static void main (String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ErtugrulSen\\Desktop\\DFX\\DFX Testing Training-2022\\training-functional-test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        WebElement searchField = driver.findElement(By.name("q"));
        searchField.click();
        searchField.sendKeys("definex");
        searchField.sendKeys(Keys.ENTER);

        WebElement imagesLink = driver.findElements(By.linkText("Görseller")).get(0);
        imagesLink.click();

        WebElement imageElement = driver.findElements(By.cssSelector("img[class='rg_i Q4LuWd']")).get(0);
        WebElement imageElement2 = driver.findElement(By.xpath("//*[@id=\'islrg\']/div[1]/div[1]/a[1]/div[1]/img"));
        imageElement2.click();
        driver.close();
    }
}
