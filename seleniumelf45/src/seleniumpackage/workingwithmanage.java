package seleniumpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithmanage {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apple.com/");
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		}
}
