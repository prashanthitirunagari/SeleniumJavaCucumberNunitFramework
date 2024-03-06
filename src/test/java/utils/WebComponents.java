package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import Driver.DriverUtil;

import java.time.Duration;

public class WebComponents{
//	private WebDriver driver = getDriver();
    protected WebDriver driver = DriverUtil.getDriver();

	
    public void clickOnElement(By by) {
        WebElement element = driver.findElement(by);
        element.click();
    }


    public void sendTextToElement(WebElement element, String str) {
        element.sendKeys(str);
    }
    
    
    protected void waitForElementClickable(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected void waitForElementClickable(WebElement element, Duration sec){
        WebDriverWait wait = new WebDriverWait(driver, sec);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected void waitForElementVisible(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected boolean ElementDisplayed(WebElement element){
       return element.isDisplayed();
    	   
    }
    
    protected void setTextAs(WebElement element, String text){
        element.sendKeys(text);
    }

    protected void clearElement(WebElement element){
        element.clear();
    }

    protected void clickElement(WebElement element){
        waitForElementClickable(element);
        element.click();
    }

    protected void clickElementByJavascriptExecutor(String xpath){
        WebElement element=driver.findElement(By.xpath(xpath));
        JavascriptExecutor ex=(JavascriptExecutor)driver;
        ex.executeScript("arguments[0].click()", element);
    }

    protected void clickLink(WebElement element){
        waitForElementVisible(element);
        element.click();
    }

    protected String getText(WebElement element){
        waitForElementVisible(element);
        return element.getText();
    }

    protected void hoverAndClick(WebElement element, WebElement subelement){
        Actions action = new Actions(driver);
        waitForElementVisible(element);
        action.moveToElement(element).perform();
        waitForElementVisible(subelement);
        action.moveToElement(subelement).click().build().perform();
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}
