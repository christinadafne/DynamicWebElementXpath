package zoopla_pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import zoopla_utils.Utils;

public class ZooplaListingPage extends Utils{
	
	
	
	
	@FindAll({
	@FindBy(xpath="//p[@data-testid='listing-price']")
	})
	List<WebElement> cost;
	
	public ZooplaListingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void collectcost() {
		List<Object> li=new ArrayList<Object>();
		int size=cost.size();
		for(int i=0;i<size;i++)
		{
			String value=cost.get(i).getText().replaceAll("£","");
			li.add(value);
		}
		System.out.println(li);
	}
	
	
}
