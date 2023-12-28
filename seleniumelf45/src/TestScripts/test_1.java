package TestScripts;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POM_Repositiry.LoginPage;
import genric_Lib.Baseclass;

public class test_1 extends Baseclass{
	@Test
	public void testcase01() {
	LoginPage login=new LoginPage(driver);
	login.getLogin().click();
//	if(login.getUsername().getText() ==""){
//		Reporter.log("Homepage is displayed", true);
//	}
		
	
	}
	
}
