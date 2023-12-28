package AUTHENTICATIONPOPUP;

import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class avoidingauthenticaton {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		WebDriverWait Explicit=new WebDriverWait(driver, Duration.ofMinutes(2));
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}

}



































































