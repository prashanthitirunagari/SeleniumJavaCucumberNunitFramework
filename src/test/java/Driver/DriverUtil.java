package Driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import java.io.ByteArrayInputStream;
import utils.ConfigurationReader;



public class DriverUtil {
	DriverFactory driverFactory;

    public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	@SuppressWarnings("deprecation")
	public static void InitializeDriver() {

		 driver.set(DriverFactory.getDriver());
		 driver.get().navigate().to(ConfigurationReader.get("url"));
	     driver.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.get().manage().window().maximize();
		
	}
	
    public static WebDriver getDriver(){
        if (driver.get() == null){
        	InitializeDriver();
        }
        return driver.get();
    }
    
    public static void tearDown(){
        driver.get().manage().deleteAllCookies();
       // getDriver().close();
        getDriver().close();
    }
    
    public void open(String url) {
        driver.get().get(url);
    }
    
    public static void takeScreenshot(Scenario scenario){
        // Take a screenshot...
        final byte[] screenshot = ((TakesScreenshot) driver.get()).getScreenshotAs(OutputType.BYTES);
        // embed it in the report.
        scenario.attach(screenshot, "image/png", "take screenshot");
       // scenario.embed(screenshot, "image/png");
    }
	
}
