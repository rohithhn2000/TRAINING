package seleniumpgpractise;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.jmx.ManagedOperation;

public class tillmanage {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("Webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oreo.com/");
		driver.getTitle();
		File file=new File("practise.HTML");
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("File created");
		}
		else {
			System.out.println("File already exists");
		}
		String Source=driver.getPageSource();
		FileOutputStream fos=new FileOutputStream(file);
		fos.write(Source.getBytes());
		driver.getWindowHandle();
		driver.get("https://in.puma.com/in/en");
		Thread.sleep(4000);
		driver.get("https://www.biskfarm.com/");
		Navigation navigate=driver.navigate();
		navigate.back();
		Thread.sleep(4000);
		navigate.forward();
		Thread.sleep(4000);
		navigate.refresh();
		driver.manage().window().minimize();
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.manage().window().fullscreen();
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		Dimension Size=driver.manage().window().getSize();
		System.out.println("The height "+Size.getHeight());
		System.out.println("The width: "+Size.getWidth());
		Dimension targetsize=new Dimension(500,500);
		driver.manage().window().setSize(targetsize);
		Point position=driver.manage().window().getPosition();
		Thread.sleep(2000);
		System.out.println("The X dimension"+ position.getX());
		System.out.println("The Y Dimesion"+position.getY());
		Thread.sleep(2000);
		Point targetposition=new Point(100,200);
		driver.manage().window().setPosition(targetposition);
		driver.manage().window().maximize();	
		
		
		
	
	}

}
