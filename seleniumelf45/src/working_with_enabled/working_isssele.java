package working_with_enabled;

import org.openqa.selenium.chrome.ChromeDriver;

public class working_isssele {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.skillrary.com/user/login/");
	Thread.sleep(2000);	
	
}
}
