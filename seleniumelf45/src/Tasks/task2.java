package Tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {
	public static void main(String[] args) throws InterruptedException, IOException {
File f1=new File("Sample.txt");
if(!f1.exists())
{
	System.out.println("File is created");
	f1.createNewFile();
		}
else {
	System.out.println("File already exists");
	
}
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.booking.com");
		Thread.sleep(5000);
		FileOutputStream fos=new FileOutputStream(f1);
		String source=c.getPageSource();
		fos.write(source.getBytes());
		FileInputStream fis=new FileInputStream(f1);
		int i=fis.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fis.read();
		}
	}

}
