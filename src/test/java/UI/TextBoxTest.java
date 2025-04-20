package UI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TextBoxTest {

    public WebDriver driver = new ChromeDriver(); //создаем экземпляр класса WebDriver

    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability(CapabilityType.PAGE_LOAD_STRATEGY,"eager");//стратегия загрузки страницы
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize(); //открываем окно браузера во весь экран
    }
    
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void checkTextBox(){
        driver.get("https://demoqa.com/text-box"); //переходим на нужную страницу
        WebElement userNameInput = driver.findElement(By.xpath("//input[@id='userName']"));
        userNameInput.sendKeys("ganna");

        WebElement userEmailInput = driver.findElement(By.xpath("//input[@id='userEmail']"));
        userEmailInput.sendKeys("ganna@mail.ru");

        WebElement userCurrentAddressTextArea = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        userCurrentAddressTextArea.sendKeys("kursk");

        WebElement userPermanentAddressTextArea = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        userPermanentAddressTextArea.sendKeys("kursk/engelsa");



        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
