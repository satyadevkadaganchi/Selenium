import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OpenIE  {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		WebDriver driver=new  InternetExplorerDriver();
		
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
	}

}
