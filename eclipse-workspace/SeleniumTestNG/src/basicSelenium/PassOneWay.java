package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PassOneWay {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gajju\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
         ChromeDriver dr= new ChromeDriver();
         dr.manage().window().maximize();
         dr.get("http://newtours.demoaut.com/");
         dr.findElement(By.name("userName")).sendKeys("mercury");
         dr.findElement(By.name("password")).sendKeys("mercury");
         dr.findElement(By.name("login")).click();
         dr.findElement(By.xpath("//input[@value='oneway']")).click();
       boolean b=dr.findElement(By.xpath("//input[@value='oneway']")).isSelected();
       System.out.println(b);
       WebElement ele=dr.findElement(By.xpath("//select[@name='passCount']"));
       Select sel=new Select(ele);
       sel.selectByVisibleText("1");
       WebElement e=dr.findElement(By.xpath("//select[@name='fromPort']"));
       Select s=new Select(e);
       s.selectByVisibleText("London");
       WebElement ab=dr.findElement(By.xpath("//select[@name='fromMonth']"));
       Select a=new Select(ab);
       a.selectByVisibleText("March");
       WebElement d=dr.findElement(By.xpath("//select[@name='fromDay']"));
       Select c=new Select(d);
       c.selectByVisibleText("10");
       WebElement f=dr.findElement(By.xpath("//select[@name='toPort']"));
       Select g=new Select(f);
       g.selectByVisibleText("Paris");
       dr.findElement(By.xpath("//input[@value='Business']")).click();
       Boolean r=dr.findElement(By.xpath("//input[@value='Business']")).isSelected();
       System.out.println(r);
       WebElement m=dr.findElement(By.xpath("//select[@name='airline']"));
       Select n=new Select(m);
       n.selectByVisibleText("Unified Airlines");
       dr.findElement(By.xpath("//input[@name='findFlights']")).click();
	}

}
