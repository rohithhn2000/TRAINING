package Tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
public static void main(String[] args) throws IOException {
	File f1=new File("task1.txt");
	{
		boolean value=f1.createNewFile();
		if(value) {
			System.out.println("The file created");
		}
		else {
			System.out.println("The already exist");
		}
	}
	System.setProperty("webdriver.chrome.webdriver", "./Drivers/chromedrivers.exe");
	ChromeDriver c=new ChromeDriver();
	c.get("https://zomato.com");
	FileOutputStream fos=new FileOutputStream(f1);
	String Url=c.getCurrentUrl();
	String Title=c.getTitle();
	fos.write(Url.getBytes());
	
	fos.write(Title.getBytes());
	
	
	
	
}
}
