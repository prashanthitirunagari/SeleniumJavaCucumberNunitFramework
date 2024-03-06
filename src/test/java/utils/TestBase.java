package utils;



import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	
	public static WebDriver InitializeDriver() {
//		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//java/resources//global.properties");
//		Properties prop = new Properties();
//		prop.load(fis);
//		String url = prop.getProperty("QAUrl");
//		String browser_properties = prop.getProperty("browser");
//		String browser_maven=System.getProperty("browser");
		String browser="firefox";
//		String browser = browser_maven!=null ? browser_maven : browser_properties;
		
		
		
		if(driver == null)
		{
			if(browser.equalsIgnoreCase("firefox"))
			{				
				WebDriverManager.firefoxdriver().setup();
				 driver = new FirefoxDriver();
			}
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get(url);
//			driver.get("https://www.gmail.com");
//		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[3]/span/div/div/div/div[3]/div[1]/button[2]/div")).click();

		}
		
		return driver;
	}

    public static WebDriver getDriver(){
        if (driver == null){
        	InitializeDriver();
        }
        return driver;
    }
	
	public void teardownmethod() {
		driver.close();
		
	}
	
	
}
