package WorkingwithBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PayBillScenario {
    public static void main(String[] args){

        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://birdbank.pythonanywhere.com/");

        driver.findElement(By.id("signin_button")).click();
        driver.findElement(By.xpath("//input[@id='id_username']")).sendKeys("testuser1");
        driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("testpassword");
        driver.findElement(By.xpath("//button[@id='signin']")).click();

        driver.findElement(By.linkText("PAY BILLS")).click();
        driver.findElement(By.xpath("//td[text()='Yes Mutual Fund']/following-sibling::td[last()]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("spinner")));

        driver.findElement(By.id("accounttype")).click();
        WebElement fromAccountEle = driver.findElement(By.id("accounttype"));
        Select fromAccount = new Select(fromAccountEle);
        fromAccount.selectByVisibleText("Savings");

        driver.findElement(By.id("accountnumber1")).click();
        WebElement fromAccEle = driver.findElement(By.id("accountnumber1"));
        Select fromAcc = new Select(fromAccEle);
        fromAcc.selectByVisibleText("9999000453354533");

        driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("500");
        //driver.findElement(By.xpath("//input[@placeholder='(What's this for)']")).sendKeys("BillPayment");
        driver.findElement(By.id("confirm")).click();



    }
}
