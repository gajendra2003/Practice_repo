package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PassThreeOneWay {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drive","C:\\Users\\gajju\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
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
	       sel.selectByVisibleText("3");
	       WebElement c=dr.findElement(By.xpath("//select[@name='fromPort']"));
	       Select d=new Select(c);
	       d.selectByVisibleText("New York");
	       WebElement e=dr.findElement(By.xpath("//select[@name='fromMonth']"));
	       Select f=new Select(e);
	       f.selectByVisibleText("April");
	       WebElement g=dr.findElement(By.xpath("//select[@name='fromDay']"));
	       Select h=new Select(g);
	       h.selectByVisibleText("15");
	       WebElement i=dr.findElement(By.xpath("//select[@name='toPort']"));
	       Select j=new Select(i);
	       j.selectByVisibleText("Portland");
	       dr.findElement(By.xpath("//input[@value='First']")).click();
	       Boolean br=dr.findElement(By.xpath("//input[@value='First']")).isSelected();
	       System.out.println(br);
	       WebElement k=dr.findElement(By.xpath("//select[@name='airline']"));
	       Select l=new Select(k);
	       l.selectByVisibleText("Pangea Airlines");
	       dr.findElement(By.xpath("//input[@name='findFlights']")).click();
	       

		

	}

}
