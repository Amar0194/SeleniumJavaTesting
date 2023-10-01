//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class A3 {

    public static void main(String[] args)
    {

        WebDriver driver=new ChromeDriver();
        driver.get("http://facebook.com");
        driver.manage().window().maximize();

        String pgtitle=driver.getTitle();
        System.out.println("Page Title is: "+pgtitle);

        String pgurl=driver.getCurrentUrl();
        System.out.println("Current URL is: "+pgurl);

    }

}
