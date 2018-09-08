import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static junit.framework.TestCase.assertEquals;

public class registrationCeneo {

    private WebDriver driver;
    boolean isElementPresent;
    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() throws Exception {
        //zamknij przeglądarkę
        //driver.close();

    }


    @Test

    public void testIsUserSuccessfullyCreated() {

        String company = "Cemeo1";
        String street = "Rzeznicza";
        String building = "2";
        String apartmentNumber = "B";
        String zipCode = "52-130";
        String city = "Wrocław";
        String nip = "6440016184";
        String regon = "590347175";
        String bankAccountNumber = "27101016740014852222000000";

        String fistname = "Paweł";
        String lastname = "Kwiatkowski";
        String email = "lubieplacki@ceneo.pl";
        String emailRepeat = "lubieplacki@ceneo.pl";
        String phoneNumber = "666666666";

        String shopName = "lubieplacki.pl";
        String url = "https://www.ceneo.pl/";
        String regulations = "https://cdn.neonet.pl/regulaminy/Regulamin_NEONET_do_30_06_2015.pdf";
        String financialEmail = "lubieplacki@ceneo.pl";
        String notificationsEmail = "lubieplacki@ceneo.pl";
        String staffEmail = "lubieplacki@ceneo.pl";
        String questionsEmail = "lubieplacki@ceneo.pl";

        //lokatory

        String profileLocator = "/html/body/div[2]/div/div/form/fieldset[1]/div[2]/div[2]/select/option[2]";
        String companyLocator = "CompanyName";
        String streetLocator = "CompanyStreetLine";
        String buildingLocator = "CompanyBuildingNumber";
        String apartmentNumberLocator = "CompanyApartmentNumber";
        String zipCodeLocator = "CompanyPostalCode";
        String cityLocator = "CompanyCity";
        String countryLocator = "/html/body/div[2]/div/div/form/fieldset[1]/div[8]/div[2]/select/option[143]";
        String typeOfBusinessLocator = "/html/body/div[2]/div/div/form/fieldset[1]/div[9]/div[2]/select/option[2]";
        String nipLocator = "NIP";
        String regonLocator = "REGON";
        String bankAccountNumberLocator = "DirectPaymentIbanAccountNumber";

        String firstnameLocator = "ContactPersonFirstName";
        String lastnameLocator = "ContactPersonLastName";
        String emailLocator = "ContactPersonEmailAddress";
        String emailRepeatLocator = "ContactPersonRepeatEmailAddress";
        String phoneNumberLocator = "ContactPersonCellPhoneNumber";

        String shopNameLocator = "ShopName";
        String urlLocator = "ShopUrl";
        String categoryLocator = "/html/body/div[2]/div/div/form/fieldset[3]/div[3]/div[2]/select/option[2]";
        String storeSoftwareLocator = "/html/body/div[2]/div/div/form/fieldset[3]/span[3]/div[1]/div[2]/select/option[2]";
        String regulationsLocator = "TermsUrl";
        String financialEmailLocator = "FinancialEmail";
        String notificationsEmailLocator = "OrdersEmail";
        String staffEmailLocator = "GuaranteesReturnsAndComplaintsEmail";
        String questionsEmailLocator = "QuestionsEmail";
        String processingDataTermsAgreedLocator = "//*[@id=\"ProcessingDataTermsAgreed\"]";
        String promotionsTermsAgreedLocator = "//*[@id=\"PromotionsTermsAgreed\"]";
        String submitButtonLocator = "/html/body/div[2]/div/div/form/p/input";


        //1 Dane księgowe firmy

        //otwórz stronę z formularzem Ceneo

        driver.get("https://formularz.ceneo.pl/");

        //wybierz profil firmy

        WebElement profileElement = driver.findElement(By.xpath(profileLocator));
        profileElement.click();

        //uzupełnij nazwę firmy

        WebElement companyElement = driver.findElement(By.id(companyLocator));
        companyElement.clear();
        companyElement.sendKeys(company);

        //uzupełnij ulicę

        WebElement streetElement = driver.findElement(By.id(streetLocator));
        streetElement.clear();
        streetElement.sendKeys(street);

        //uzupełnij numer budynku

        WebElement buildingElement = driver.findElement(By.id(buildingLocator));
        buildingElement.clear();
        buildingElement.sendKeys(building);

        //uzupełnij numer lokalu

        WebElement apartmentNumberElement = driver.findElement(By.id(apartmentNumberLocator));
        apartmentNumberElement.clear();
        apartmentNumberElement.sendKeys(apartmentNumber);

        //uzupełnij kod pocztowy

        WebElement zipCodeElement = driver.findElement(By.id(zipCodeLocator));
        zipCodeElement.clear();
        zipCodeElement.sendKeys(zipCode);

        //uzupełnij miasto

        WebElement cityElement = driver.findElement(By.id(cityLocator));
        cityElement.clear();
        cityElement.sendKeys(city);

        //wybierz kraj

        WebElement countryElement = driver.findElement(By.xpath(countryLocator));
        countryElement.click();

        //wybierz rodzaj działalności

        WebElement typeOfBusinessElement = driver.findElement(By.xpath(typeOfBusinessLocator));
        typeOfBusinessElement.click();

        //uzupełnij NIP

        WebElement nipElement = driver.findElement(By.id(nipLocator));
        nipElement.clear();
        nipElement.sendKeys(nip);

        //uzupełnij REGON

        WebElement regonElement = driver.findElement(By.id(regonLocator));
        regonElement.clear();
        regonElement.sendKeys(regon);

        //uzupełnij numer konta bankowego

        WebElement bankAccountNumberElement = driver.findElement(By.id(bankAccountNumberLocator));
        bankAccountNumberElement.clear();
        bankAccountNumberElement.sendKeys(bankAccountNumber);

        //2 Osoba kontaktowa (koordynator ds. współpracy z Ceneo)

        //uzupełnij imię pracownika

        WebElement firstnameElement = driver.findElement(By.id(firstnameLocator));
        firstnameElement.clear();
        firstnameElement.sendKeys(fistname);

        //uzupełnij nazwisko pracownika

        WebElement lastnameElement = driver.findElement(By.id(lastnameLocator));
        lastnameElement.clear();
        lastnameElement.sendKeys(lastname);

        //uzupełnij adres e-mail

        WebElement emailElement = driver.findElement(By.id(emailLocator));
        emailElement.clear();
        emailElement.sendKeys(email);

        //potwierdź adres e-mail

        WebElement emailRepeatElement = driver.findElement(By.id(emailRepeatLocator));
        emailRepeatElement.clear();
        emailRepeatElement.sendKeys(emailRepeat);

        //uzupełnij numer telefonu kontaktowego

        WebElement phoneNumberElement = driver.findElement(By.id(phoneNumberLocator));
        phoneNumberElement.clear();
        phoneNumberElement.sendKeys(phoneNumber);

        //3 Dane sklepu

        //uzupełnij nazwę firmy

        WebElement shopNameElement = driver.findElement(By.id(shopNameLocator));
        shopNameElement.clear();
        shopNameElement.sendKeys(shopName);

        //uzupełnij URL

        WebElement urlElement = driver.findElement(By.id(urlLocator));
        urlElement.clear();
        urlElement.sendKeys(url);

        //wybierz branżę sklepu

        WebElement categoryElement = driver.findElement(By.xpath(categoryLocator));
        categoryElement.click();

        //wybierz oprogramowanie sklepu

        WebElement storeSoftwareElement = driver.findElement(By.xpath(storeSoftwareLocator));
        storeSoftwareElement.click();

        //uzupełnij regulamin sklepu

        WebElement regulationsElement = driver.findElement(By.id(regulationsLocator));
        regulationsElement.clear();
        regulationsElement.sendKeys(regulations);

        //uzupełnij e-mail do obsługi płatności

        WebElement financialEmailElement = driver.findElement(By.id(financialEmailLocator));
        financialEmailElement.clear();
        financialEmailElement.sendKeys(financialEmail);

        //uzupełnij e-mail do powiadomień

        WebElement notificationsEmailElement = driver.findElement(By.id(notificationsEmailLocator));
        notificationsEmailElement.clear();
        notificationsEmailElement.sendKeys(notificationsEmail);

        //uzupełnij e-mail do obsługi posprzedażowej

        WebElement staffEmailElement = driver.findElement(By.id(staffEmailLocator));
        staffEmailElement.clear();
        staffEmailElement.sendKeys(staffEmail);

        //uzupełnij e-mail do obsługi pytań użytkowników

        WebElement questionsEmailElement = driver.findElement(By.id(questionsEmailLocator));
        questionsEmailElement.clear();
        questionsEmailElement.sendKeys(questionsEmail);

        //wybierz zgodę na przetwarzanie danych osobowych

        WebElement processingDataTermsAgreedElement = driver.findElement(By.xpath(processingDataTermsAgreedLocator));
        processingDataTermsAgreedElement.click();

        //wybierz zgodę marketingową

        WebElement promotionsTermsAgreedElement = driver.findElement(By.xpath(promotionsTermsAgreedLocator));
        promotionsTermsAgreedElement.click();

        // klik w button submit

        WebElement submitButtonElement = driver.findElement(By.xpath(submitButtonLocator));
        submitButtonElement.click();

        //Sprawdż czy użytkownik został założony
        WebElement submitMessage = driver.findElement(By.id("submit-msg"));
        String result = submitMessage.getText();

        assertEquals("Successfully submitted!", result);


    }

}
