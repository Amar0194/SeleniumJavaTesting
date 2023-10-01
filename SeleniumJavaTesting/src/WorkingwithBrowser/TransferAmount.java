package WorkingwithBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class TransferAmount {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://birdbank.pythonanywhere.com");

        WebElement loginButton = driver.findElement(By.id("signin_button"));
        loginButton.click();
        driver.findElement(By.id("id_username")).sendKeys("testuser1");
        driver.findElement(By.id("id_password")).sendKeys("testpassword");
        driver.findElement(By.id("signin")).click();

        driver.findElement(By.linkText("TRANSFER")).click();
        driver.findElement(By.id("ownacc")).click();
        driver.findElement(By.id("9999000473354500")).click();

        WebElement fromAccountele = driver.findElement(By.id("fromaccount"));
        Select fromAccount = new Select(fromAccountele);
        //fromAccount.selectByIndex(3);
        fromAccount.selectByValue("530");
        fromAccount.selectByVisibleText("9999000453354530");


        WebElement toAccountele = driver.findElement(By.id("toaccount"));
        if(toAccountele.isEnabled()){
            System.err.println("Error: the element is enabled");
        }

        driver.findElement(By.id("amount")).sendKeys("500");
        driver.findElement(By.id("message")).sendKeys("Amount transfer");
        driver.findElement(By.id("confirm_payment")).click();

    }
}