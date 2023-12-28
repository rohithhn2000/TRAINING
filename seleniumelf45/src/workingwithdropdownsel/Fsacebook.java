package workingwithdropdownsel;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fsacebook {
	public static void main(String[] args) throws IOException, InterruptedException {
	//	System.setProperty("Webdriver.chrome.driver", "./Drivers/chromedriver.exe");
//		ChromeDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
//		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805511%7Cb%7Cfacebook%20create%20account%7C&placement=&creative=550525805511&keyword=facebook%20create%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-12091220328%26loc_physical_ms%3D9062072%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQiAsburBhCIARIsAExmsu6lr_JHQLYr7KD4kGtv5ycT5hTJD07fTWxr78lqVD42Bv7pHNMFsHcaAt-OEALw_wcB");
//		WebElement day= driver.findElement(By.id("day"));
//		WebElement month=driver.findElement(By.id("month"));
//		WebElement year=driver.findElement(By.id("year"));
//		
//		Select days=new Select(day);
//		Select months=new Select(month);
//		Select years=new Select(year);
//		System.out.println(days.isMultiple());
//		days.selectByIndex(18);
//		months.selectByValue("4");
//		years.selectByVisibleText("2000");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		driver.get("https://demoapp.skillrary.com/");
		WebElement dropdown=driver.findElement(By.id("cars"));
		Select multilist=new Select(dropdown);
		System.out.println(multilist.getOptions().size());
		
//		multilist.selectByIndex(0);
//		Thread.sleep(1000);
//		multilist.selectByValue("99");
//		Thread.sleep(1000);
//		multilist.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");
//		Thread.sleep(1000);
//		multilist.deselectByIndex(5);
//		multilist.deselectByIndex(2);
//		Thread.sleep(1000);
//		multilist.deselectByValue("199");
//		multilist.deselectAll();
		
	}

}
