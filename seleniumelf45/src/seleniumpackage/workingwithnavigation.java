package seleniumpackage;


import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithnavigation {
	public static void main(String[] args)throws InterruptedException  {
		System.setProperty("WebDriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.navigate().to("https://in.puma.com/in/en?utm_source=GGL-SEA&utm_medium=BS&utm_aud=OTH&utm_obj=OLC&utm_campaign=BS_GGL_IN_BS_GGL_SEA_TXT_Brand-Exact_agency_1000067495857508873&gad_source=1&gclid=Cj0KCQiA6vaqBhCbARIsACF9M6laka2LSY7FzL79Dr1aXbio3vvV_hZeNC7y9q9kt-4ll-egnn6otG8aAgpwEALw_wcB");
		d.navigate().to("https://www.apple.com/");
		Navigation navigation=d.navigate();//upcasting
		navigation.back();
		navigation.forward();
		navigation.refresh();
		
		
	}

}
