import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class multipleValuesTest {
    private WebDriver driver;

    String search = "s";

    //Lokatory
    String autocompleteLocator = "/html/body/div[1]/div/div[2]/aside[3]/div[2]/div/ul/li[2]/a";
    String multipleValuesLocator = "ui-id-5";
    String searchLocator = "tagsss";


    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    /*@After
    public void tearDown() {
        driver.close();
    } */

    @Test
    public void multipleValuesTagProgrammingLanguage() {
        driver.get("http://demoqa.com/");

        WebElement autoCompleteElement = driver.findElement(By.xpath(autocompleteLocator));
        autoCompleteElement.click();

        WebElement multipleValueElement = driver.findElement(By.id(multipleValuesLocator ));
        multipleValueElement.click();

        WebElement searchElement = driver.findElement(By.id(searchLocator));
        searchElement.clear();
        searchElement.sendKeys(search);


            }
        }












