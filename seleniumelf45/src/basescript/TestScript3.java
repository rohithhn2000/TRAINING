package basescript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript3 extends BaseScript{

	@Test
	public void loginWithValidCred() {
		Reporter.log("from login with valid credentials",true);
	}
}
