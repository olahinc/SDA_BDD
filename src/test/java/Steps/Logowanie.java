package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;

public class Logowanie {
    WebDriver driver;

    @Given("Uzytkownik otwiera przegladarke")
    public void testUzytkownikOtwieraPrzegladarke(){
        System.out.println("Uzytkownik otworzyl przegladarke");
        //System.setProperty("webdriver.chrome.driver","d:/Chromedriver107/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Given("Uzytkownik wpisuje adres https:\\/\\/the-internet.herokuapp.com\\/login")
    public void uzytkownik_wpisuje_adres_https_the_internet_herokuapp_com_login() {
        System.out.println("Uzytkownik wpisal adres strony internetowej");
        driver.navigate().to("https://the-internet.herokuapp.com/login");
    }
    @When("Uzytkownik wpisuje poprawny username")
    public void uzytkownik_wpisuje_poprawny_username() {
        System.out.println("Uzytkownik wpisuje poprawny username");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
    }
    @When("Uzytkownik wpisuje pooprawny password")
    public void uzytkownik_wpisuje_pooprawny_password() {
        System.out.println("Uzytkownik wpisuje poprawne hasło");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
    }
    @When("Uzytkownik klika przycisk Login")
    public void uzytkownik_klika_przycisk_login() {
        System.out.println("Uzytkownik klika przycisk Login");
        driver.findElement(By.tagName("button")).click();
    }
    @Then("Uzytkownik zostaje poprawnie zalogowany")
    public void uzytkownik_zostaje_poprawnie_zalogowany() {
        System.out.println("Uzytkownik zostal poprawnie zalogowany");
        Assert.assertEquals("https://the-internet.herokuapp.com/secure",driver.getCurrentUrl());
        driver.close();
    }
}
