package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Basepage {
	public Basepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Register")
	private WebElement Register;

	public WebElement getRegister() {
		return Register;
	}

	public void setRegister(WebElement register) {
		Register = register;
	}

}

 