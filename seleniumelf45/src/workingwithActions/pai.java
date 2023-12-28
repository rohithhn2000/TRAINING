package workingwithActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pai {
	public static void main(String[] args) {
		ChromeDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofMinutes(2));
		driver.get("https://www.google.com/aclk?sa=l&ai=DChcSEwj98KGY3_qCAxWJgmYCHbtACmEYABAAGgJzbQ&ase=2&gclid=EAIaIQobChMI_fChmN_6ggMViYJmAh27QAphEAAYASAAEgJhCfD_BwE&sig=AOD64_0Ufvd_mcFNpQ0avQ14AsbUyepiMw&q&nis=4&adurl&ved=2ahUKEwizs5mY3_qCAxWwRWwGHcQuCK0Q0Qx6BAgFEAE");
        WebElement hover = driver.findElement(By.partialLinkText("Select Category"));
       Actions action = new Actions(driver);
       action.moveToElement(hover).perform();
       driver.findElement(By.id("furniture-2")).click();
       WebElement source = driver.findElement(By.xpath("//span[@class='irs-slider from']"));
       WebElement dest = driver.findElement(By.xpath("//span[contains(@class,'irs-slider to')]"));
       action.dragAndDropBy(source, 50,0).perform();
       
       

	}

}
