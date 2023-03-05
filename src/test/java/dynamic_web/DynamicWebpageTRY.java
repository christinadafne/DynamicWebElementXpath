package dynamic_web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebpageTRY {
	static WebDriver driver;

	public static void display(String loc) {
		List<WebElement> list = driver.findElements(By.xpath(loc));
		for (WebElement ele : list) {
			System.out.println(ele.getText());
			
		}
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gtess\\eclipse-workspace\\WebChallenge1\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		long time = System.currentTimeMillis() + 10000;
		long newtime = System.currentTimeMillis();

		driver.get("https://www.worldometers.info/world-population/");
		// String
		// today="//div[text()='Today']//parent::div//span[@class='rts-counter']";
		String pop = "//div[@class='maincounter-number']//span[@class='rts-counter']";
		String thisYear = "//div[text()='This year' or text()='Today']//parent::div//span[@class='rts-counter']";
		while (newtime < time) {
			System.out.println("time-->"+newtime);
			System.out.println("current world population :");
			display(pop);
			System.out.println("world population :");
			display(thisYear);
			System.out.println("-------------------------------");
			newtime = System.currentTimeMillis();
			

		}
driver.quit();
	}

}
