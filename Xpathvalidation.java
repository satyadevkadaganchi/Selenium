import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathvalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		//driver.findElement(By.xpath("//*[@id=\'u_0_e\']/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		String x=driver.findElement(By.xpath("//*[@id='globalContainer']/div[3]/div/div/div")).getText();
		System.out.println(x);
	}
	}


