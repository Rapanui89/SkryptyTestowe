import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.*;

public class dragAndDropTestTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://demoqa.com/droppable/");
    }

    @After
    public void tearDown() {
        driver.close();
    }


    //Test drap and drop
    @Test
    public void testDragAndDrop() {

        Actions builder = new Actions(driver);

        WebElement dragElement = driver.findElement(By.id("draggableview"));
        WebElement dropElement = driver.findElement(By.id("droppableview"));
        WebElement dropFinal = driver.findElement(By.id("droppableview"));

        Action dragAndDrop = builder.clickAndHold(dragElement)
                .moveToElement(dropElement)
                .release(dragElement)
                .build();
        dragAndDrop.perform();

        String result = dropFinal.getText();
        assertEquals("Dropped!", result);
    }

}