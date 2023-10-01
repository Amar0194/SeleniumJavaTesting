package WorkingwithBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class PayBills {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://birdbank.pythonanywhere.com/");

        driver.findElement(By.id("signin_button")).click();
        driver.findElement(By.id("id_username")).sendKeys("testuser1");
        driver.findElement(By.id("id_password")).sendKeys("testpassword");
        driver.findElement(By.id("signin")).click();

        driver.findElement(By.xpath("//a[@id='nav-paybills-tab']")).click();
        driver.findElement(By.xpath("//button[@id='add_payee']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//input[@placeholder='Enter Biller Name']")).sendKeys("Jessica");
        driver.findElement(By.xpath("//input[@placeholder='Enter Registration Number']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@id='no']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Enter Pay Limit']")).sendKeys("1000");







    }
}
