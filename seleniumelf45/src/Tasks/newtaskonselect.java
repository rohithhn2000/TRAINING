package Tasks;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class newtaskonselect {
	public static void main(String[] args) throws  InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		driver.get("https://demoapp.skillrary.com/");
		WebElement dropdown=driver.findElement(By.id("cars"));
		Select multilist=new Select(dropdown);
		int totalnoofoptions=multilist.getOptions().size();
		 multilist.selectByIndex(totalnoofoptions-1);
	}

}
