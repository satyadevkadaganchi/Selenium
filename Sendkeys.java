import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
/*		driver.findElement(By.id("email")).sendKeys("I am Satyadev");
		driver.findElement(By.name("pass")).sendKeys("s"); */
		
		driver.findElement(By.className("inputtext_55r1_6luy")).sendKeys("h");
				}

}
