package dynamic_web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_population {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gtess\\eclipse-workspace\\WebChallenge1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		long time = System.currentTimeMillis() + 10000;
		long newtime = System.currentTimeMillis();
		driver.get("https://www.worldometers.info/world-population/");
		while (newtime <= time) {

			String pop = driver.findElement(By.xpath("//div[@class='maincounter-number']//span[@class='rts-counter']"))
					.getText();
			System.out.println("current world population :" + pop);
			System.out.println("TODAY");
			String birthtoday = driver.findElement(By.xpath("(//div[@class='sec-counter'])[1]//span")).getText();
			System.out.println("Births Today :" + birthtoday);
			String deathtoday = driver.findElement(By.xpath("(//div[@class='sec-counter'])[2]//span")).getText();
			System.out.println("Deaths Today:" + deathtoday);
			String popgrthtoday = driver.findElement(By.xpath("(//div[@class='sec-counter'])[3]//span")).getText();
			System.out.println("population growth Today:" + popgrthtoday);
			System.out.println("THIS YEAR");
			String birthyear = driver.findElement(By.xpath("(//div[@class='sec-counter'])[4]//span")).getText();
			System.out.println("Births this year:" + birthyear);
			String deathyear = driver.findElement(By.xpath("(//div[@class='sec-counter'])[5]//span")).getText();
			System.out.println("Deaths this year:" + deathyear);
			String popgrthyear = driver.findElement(By.xpath("(//div[@class='sec-counter'])[6]//span")).getText();
			System.out.println("Population growth this year:" + popgrthyear);
			System.out.println("-----------------------------------------");
			newtime = System.currentTimeMillis();
		}
		driver.close();
	}

}
