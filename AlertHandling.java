import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/selenium/delete_customer.php");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("txt");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        Alert al = driver.switchTo().alert();
        Thread.sleep(3000);
        System.out.println(al.getText());
        al.dismiss();
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        al.accept();
        Alert alert= driver.switchTo().alert();
        Thread.sleep(3000);
        alert.accept();


    }
}
