package WorkingwithBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Loans {
    public static void main(String[] args){
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://birdbank.pythonanywhere.com/");

        driver.findElement(By.xpath("//button[@id='signin_button']")).click();
        driver.findElement(By.xpath("//input[@id='id_username']")).sendKeys("testuser1");
        driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("testpassword");
        driver.findElement(By.xpath("//button[@id='signin']")).click();

        driver.findElement(By.linkText("LOANS")).click();
        driver.findElement(By.xpath("//h5[text()='Car Loan']/following-sibling::span")).click();
        WebElement docEle = driver.findElement(By.id("basic"));
        Select doc = new Select(docEle);
        System.out.println(doc.isMultiple());
        List<WebElement> option = doc.getOptions();
        for(WebElement ele: option){
            System.out.println(ele.getText());
        }
        doc.selectByVisibleText("License");
        doc.selectByVisibleText("Ration card");
        System.out.println("print all the selected options");

        List<WebElement> selectedOptions = doc.getAllSelectedOptions();
        for(WebElement ele: selectedOptions){
            System.out.println(ele.getText());
        }
        System.out.println("Print firstSelectedOption");
        System.out.println(doc.getFirstSelectedOption().getText());

        doc.deselectByVisibleText("Ration card");
        System.out.println("After deselecting print all the selected options");
        selectedOptions = doc.getAllSelectedOptions();
        for(WebElement ele:selectedOptions){
            System.out.println(ele.getText());
        }

        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        if(!checkbox.isSelected()){
            checkbox.click();
        }
       }
}
