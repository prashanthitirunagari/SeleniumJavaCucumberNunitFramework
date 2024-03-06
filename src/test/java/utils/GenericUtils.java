package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenericUtils extends TestBase{
	
	private WebDriver driver;
	
	public GenericUtils(WebDriver driver) {
		this.driver = driver;
	}
	

	public void SwitchWindowToChild()
	{
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1 =s1.iterator();
		String parentWindow = i1.next();
		String childWindow = i1.next();
		driver.switchTo().window(childWindow);
	}
	
	public void clickbutton() {
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[3]/span/div/div/div/div[3]/div[1]/button[2]/div")).click();

		System.out.print("Hello");
	}
	
	
}
