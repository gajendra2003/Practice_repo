package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\gajju\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver dr=new ChromeDriver();
        dr.manage().window().maximize();
        dr.get("http://newtours.demoaut.com/");
        dr.findElement(By.linkText("REGISTER")).click();
        dr.findElement(By.name("firstName")).sendKeys("vijay");
        dr.findElement(By.name("lastName")).sendKeys("mashkole");
        dr.findElement(By.name("phone")).sendKeys("9523456781");
        dr.findElement(By.name("userName")).sendKeys("xyz.123@gamil");
        dr.findElement(By.name("address1")).sendKeys("plot 35 sector 20 5th floor");
        dr.findElement(By.name("address2")).sendKeys(" kamothe navi mumbai ");
        dr.findElement(By.name("city")).sendKeys("Navi Mumbai");
        dr.findElement(By.name("state")).sendKeys("maharashtra");
        dr.findElement(By.name("postalCode")).sendKeys("482003");
        WebElement ele=dr.findElement(By.xpath("//select[@name='country']"));
        Select sel=new Select(ele);
        sel.selectByVisibleText("INDIA");
        dr.findElement(By.xpath("//input[@name='email']")).sendKeys("viajy");
        dr.findElement(By.name("password")).sendKeys("gajju@1984");
        dr.findElement(By.name("confirmPassword")).sendKeys("mask@1984");
        dr.findElement(By.name("register")).click();
        

	}

}
