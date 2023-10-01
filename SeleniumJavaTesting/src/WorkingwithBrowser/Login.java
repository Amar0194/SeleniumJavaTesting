package WorkingwithBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login {
        public static void main(String[] args){

            ChromeOptions options = new ChromeOptions();
            WebDriver driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.get("https://birdbank.pythonanywhere.com");

            WebElement loginButton = driver.findElement(By.id("signin_button"));
            loginButton.click();
            driver.findElement(By.id("id_username")).sendKeys("testuser1");
            driver.findElement(By.id("id_password")).sendKeys("testpassword");
            driver.findElement(By.id("signin")).click();


        }
    }

