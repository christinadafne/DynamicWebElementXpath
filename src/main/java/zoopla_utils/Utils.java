package zoopla_utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utils {
	public static WebDriver driver;

	// WebDriver initialization
	public  WebDriver browser(String browser)
	{
		switch(browser)
		{
		case "chrome":
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "safari":
			driver=new SafariDriver();
			break;
		case "FireFox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
			default :
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;	
		}
		driver.manage().window().maximize();
		driver.navigate().to("https://www.zoopla.co.uk");
		
		return driver;
	}
	
	//textbox
	public void inputtext(WebElement ele,String text) throws Exception {
		Thread.sleep(2000);
		ele.sendKeys(text);

	}
	///button
	public void button(WebElement ele) {
ele.click();
String hand=driver.getCurrentUrl();
System.out.println(hand);
driver.get("http://www.google.com");
driver.get(hand);
	}
	

}
