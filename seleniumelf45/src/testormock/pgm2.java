package testormock;

import java.time.Duration;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import graphql.org.antlr.v4.runtime.tree.Tree;

public class pgm2 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		WebDriverWait Explicit=new WebDriverWait(driver, Duration.ofMinutes(2));
		String parentwindow= "file:///C:/Users/ROHITH/Downloads/TestPage.html";
		driver.get(parentwindow);
		driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();
		Set<String> windowid = driver.getWindowHandles();
		TreeSet title =new TreeSet();
		
		for (String string : windowid) {
			String Title=driver.switchTo().window(string).getTitle();
			 title.add(Title);
			
			}
//			for ( : title) {
				 
			}		
			
			}
	
		



