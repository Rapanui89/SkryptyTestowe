import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class switchWindowsTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://demoqa.com/frames-and-windows/");
    }

    @After

    public void tearDown() {
        driver.close();
    }

    //Test
    @Test
    public void switchWindowsTest() {
        WebElement linkToNewBrowserTab = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/main/article/div/div/div[1]/div/p/a"));
        linkToNewBrowserTab.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));

        WebElement menuFirstTab = driver.findElement(By.id("menu-item-144"));
        menuFirstTab.click();

        WebElement textOneTest = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/main/article/div/h2"));
        String result = textOneTest.getText();
        assertEquals("Displays collapsible content panels for presenting information in a limited amount of space.", result);

        driver.switchTo().window(tabs2.get(1));
        WebElement menuSecondTab = driver.findElement(By.id("menu-item-145"));
        menuSecondTab.click();

        WebElement tagBox = driver.findElement(By.id("tagss"));
        assertTrue(tagBox.isDisplayed());
    }


}