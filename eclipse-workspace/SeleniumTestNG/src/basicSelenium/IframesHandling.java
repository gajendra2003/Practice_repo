package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframesHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gajju\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver dr=new ChromeDriver();
        dr.manage().window().maximize();
        dr.get("http://paytm.com/");
        dr.findElement(By.xpath("//div[contains(text(),'Log In/Sign Up')]")).click();
        Thread.sleep(200);
       // dr.switchTo().frame(0);
        dr.findElement(By.xpath("//span[contains(text(),'Login/Signup with mobile number and password')]")).click();

   

	}

}
