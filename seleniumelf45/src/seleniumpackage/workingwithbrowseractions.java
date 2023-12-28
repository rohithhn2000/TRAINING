package seleniumpackage;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class workingwithbrowseractions {

	public static void main(String[] args) {
		/*
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://google.co.in");
		FirefoxDriver driver=new FirefoxDriver(); 
		driver.get("https://google.co.in");
		WebDriver d1=new ChromeDriver();
		d1.get("www.google.co.in");
		System.setProperty("webdriver.chrome.driver", "./Drivers/Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.co.in");
		System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
		EdgeDriver de=new EdgeDriver();*/
		System.setProperty("Webdriver, gecko.driver","./Drivers/geckodriver.exe");
		FirefoxDriver f1=new FirefoxDriver();
		f1.get("https://google.co.in");
	}

}
