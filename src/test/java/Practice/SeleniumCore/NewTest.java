package Practice.SeleniumCore;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
public class NewTest {

	
		@Test
		public void firstTest()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Stable_Workplace\\browserdrivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
		}
		
	

}
