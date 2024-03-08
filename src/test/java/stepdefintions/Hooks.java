package stepdefintions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import Driver.DriverUtil;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;

import java.io.File;
import java.io.IOException;


public class Hooks extends DriverUtil{

    public WebDriver driver;


    @Before
    public void setUp() throws IOException{
        InitializeDriver();
    }

    @After
    public void tearDownStep(){
    	tearDown();
    }

    @AfterStep
    public void addScreenshot(Scenario scenario) throws IOException{
    	 if(scenario.isFailed()){
    		 takeScreenshot(scenario);
    	 }
    	
    	
    }
    
}
