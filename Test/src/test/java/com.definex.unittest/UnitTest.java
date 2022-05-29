package com.definex.unittest;

import com.definex.functional.Pages;
import driver.Driver;
import org.junit.jupiter.api.*;

public class UnitTest {

    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ErtugrulSen\\Desktop\\DFX\\DFX Testing Training-2022\\training-functional-test\\chromedriver.exe");

    }
    @Test
    @DisplayName("Driver go to Definex Home Page")
    public void canGoToDefinexPage() {
        Pages.dfxPage().goTo();
        Assertions.assertTrue(Pages.dfxPage().isAt());
    }

    @Test
    @DisplayName("Driver go to Gooogle Home Page")
    public void canGoToGooglePage() {
        Pages.googlePage().goTo();
        Assertions.assertTrue(Pages.googlePage().isAt());
    }

    @AfterAll
    public static void cleanUp () {
        Driver.closeDriver();
    }
}
