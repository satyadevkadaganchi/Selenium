import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Hello");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("nk");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
}