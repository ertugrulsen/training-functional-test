package driver;

import com.definex.functional.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    static WebDriver driver = new ChromeDriver();
    public static void goTo(String url) {
        driver.get(url);
    }
    public static String title(){
        return  driver.getTitle();
    }
    public static void closeDriver(){
        driver.close();
    }

}
