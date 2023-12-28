package seleniumpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithmethods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver c=new ChromeDriver();
		c.get("Https://www.zomato.com");
		String Titleofthepage=c.getTitle();
		String Urlofthepage=c.getCurrentUrl();
		String pagesourcecode=c.getPageSource();
		String windowid=c.getWindowHandle();
		System.out.println(c.getTitle());
		System.out.println(c.getPageSource());
		System.out.println(c.getCurrentUrl());
		System.out.println(windowid);
		
		
	}
}
