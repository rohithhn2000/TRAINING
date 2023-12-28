package Dataprovider;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class normalstringurls {
	@DataProvider
	public String[] urls() {
		String[] url= {
				"https://www.oneplus.in/",
				"https://www.apple.in/"

		};
		
return url;
}
@Test(dataProvider="urls")
public void testing(String url) 
{
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.get(url);
		driver.quit();
}

}
