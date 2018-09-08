import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;
public class buyOnCeneoTest {
    private WebDriver driver;

    @Before
    public void setUP() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    /*@After
    public void tearDown() {
        driver.close();
    } */

    @Test

    public void testCorrectOrderPlacement() {

        //dane testowe
        String checkoutTextBox = "Proszę szczelnie zapakować";
        String login = "pk@gmail.com";
        String password = "123Adminpatrzy2";
        String invoiceFirstName = "Paweł";
        String invoiceLastName = "Kwiatkowski";
        String invoideFlatAdress = "Rzeźnicza 48a";
        String invoicePostalCode = "52-144";
        String invoiceCity = "Wrocław";
        String invoicePhoneNumber = "666666666";

        //lokatory
        String buyOnCeneoLocator = "/html/body/div[2]/div[3]/div[2]/div/div/div[1]/article/table/tbody/tr[4]/td/span/a/span";
        String notificationsLocator = "span.btn:nth-child(2)";
        String cookieAgreementLocator = "button.btn-info:nth-child(2)";
        String checkoutTextBoxLocator = "/html/body/div[2]/div/form/div[1]/div[1]/div[1]/div/div/div[2]/div[2]/div/div[1]";
        String paymentMetodLocator = "/html/body/div[2]/div/form/div[1]/div[1]/div[2]/ul/li[2]/label/span/span[1]";
        String paymentMetodIdeaBankLocator = "/html/body/div[2]/div/form/div[1]/div[1]/div[2]/div/table/tbody/tr[5]/td[2]/img";
        String loginLocator = "Login";
        String passwordLocator = "Password";
        String logInSubmitLocator = "/html/body/div[2]/div/form/div[1]/div[2]/div[2]/div/div/div[2]/div[3]/input";
        String invoiceLocator = "/html/body/div[2]/div/form/div[1]/div[2]/div[1]/div/span[3]/label/b";
        String invoiceNewAdressLocator = "/html/body/div[2]/div/div/div/div/section/div[3]/div[2]/div/button";
        String buyOnLocator = "/html/body/div[2]/div/form/div[2]/div/input";
        String applyNewAdressLocator = "/html/body/div[2]/div/div/div/div/section/div[3]/div[3]/form/div/input";

        driver.get("https://www.ceneo.pl/59762086");

        //Akceptacja cookiesów i powiadomień

        WebDriverWait waitForCookieAcceptButton = new WebDriverWait(driver, 10);
        WebElement cookieAgreementElement = waitForCookieAcceptButton.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div/p/button")));
        cookieAgreementElement.click();


        WebElement notificationsElement = driver.findElement(By.cssSelector(notificationsLocator));
        notificationsElement.click();


        //Zakup produktu w usłudze KUP TERAZ na karcie produktu. Oferta ze sklepu Avans.
        WebElement buyOnCeneo = driver.findElement(By.xpath(buyOnCeneoLocator));
        buyOnCeneo.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement notificationsElement2 = driver.findElement(By.cssSelector(notificationsLocator));
        notificationsElement2.click();

        //Uzupełnienie elementu checkout'u: Uwagi do zamówienia
        WebDriverWait waitForTextBox = new WebDriverWait(driver, 10);
        WebElement textBoxElement = waitForTextBox.until(ExpectedConditions.elementToBeClickable(By.xpath(checkoutTextBoxLocator)));
        textBoxElement.sendKeys(checkoutTextBox);

        //Uzupełnienie elementu checkout'u: sposób płatności.
        WebElement paymentMetod = driver.findElement(By.xpath(paymentMetodLocator));
        paymentMetod.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement paymentMetodBank = driver.findElement(By.xpath(paymentMetodIdeaBankLocator ));
        paymentMetodBank.click();




    }


}
