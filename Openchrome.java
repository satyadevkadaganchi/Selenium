import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openchrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.get("http://www.yahoo.com");
		Thread.sleep(3000);
		driver.navigate().back();
	}

}
