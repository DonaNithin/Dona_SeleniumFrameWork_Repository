package Selenium_Study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert2 {

    @Test
    public  void  alert2()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dona\\Desktop\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
        // driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        Alert al = driver.switchTo().alert();
        System.out.println(al.getText());
        al.accept();
        //Thread.sleep(3000);
        System.out.println(al.getText());
        al.accept();
        driver.quit();

    }
}
