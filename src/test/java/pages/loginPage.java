package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Driver.DriverUtil;
import utils.WebComponents;


public class loginPage extends WebComponents{
	private WebDriver driver = DriverUtil.getDriver();
	
	public loginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='email1']")
    private WebElement txtUserName;
    
    @FindBy(xpath = "//input[@name='password']")
    private WebElement txtPwd;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    private WebElement btnLogin;
    
    @FindBy(xpath = "//a[@href='/login']")
    private WebElement lnkSignIn;

    @FindBy(xpath = "//a[@href='/logout']")
    private WebElement lnkSignOut;
    
	 public void enterUserName(String username){
		 setTextAs(txtUserName, username); 
	 }
	 
	 public void enterPassword(String pwd){
		 setTextAs(txtPwd, pwd); 
	 }
	 

    public void LoginToApplication(String userName, String Password){
    	clickElement(lnkSignIn);
        enterUserName(userName);
        enterPassword(Password);
        clickElement(btnLogin);
    }
    
      
    public boolean LogoutVisible() {
    	sleep(3000);
    	return ElementDisplayed(lnkSignOut);
    }

}
