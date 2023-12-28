package POM_Repositiry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  extends BasePage{
	public LoginPage(WebDriver driver) {
	super(driver);

}
	@FindBy(id="Email")
	private WebElement email;
	
	@FindBy(id="Password")
	private WebElement password;
	
	
	@FindBy(id="RememberMe")
	private WebElement Rememberme;
	
	@FindBy(linkText ="Forgot password?")
	private WebElement Forgotpass;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement Login;
	
	@FindBy(xpath = "//a[text()='Computing and Internet']/../../..//input[@value='Add to cart']")
	private WebElement bookaddtocart;
	
	@FindBy(xpath= "//a[contains(text(),'s Rockabilly')]/../../..//input[@value='Add to cart']")
	private WebElement dressaddtocart;
	
	@FindBy(id="add-to-wishlist-button-5")
	private WebElement wishlist;
	
	
	
	
}