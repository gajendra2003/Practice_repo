package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gajju\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		// dr.get("http://google.com");
		dr.get("http://newtours.demoaut.com/");
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dr.findElement(By.partialLinkText("TERasdgc")).click();

	}

}    	