package zoopla_pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import zoopla_utils.Utils;

public class ZooplaHome extends Utils{
	
	
	@FindBy(xpath="//label[text()='Enter a city, town or postcode']//following::input")
	WebElement searchbox;
	
	@FindBy(xpath="//div[text()='Search']")
	WebElement search;
	
	public ZooplaHome() {
		PageFactory.initElements(driver, this);
	}
	
	public void searchfunc() throws Exception {
		
		inputtext(searchbox, "England");
		Thread.sleep(2000);
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_DOWN);
		button(search);
		
		

	}
	
	
}
