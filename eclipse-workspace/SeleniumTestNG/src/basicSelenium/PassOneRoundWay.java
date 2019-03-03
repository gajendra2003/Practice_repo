package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PassOneRoundWay {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gajju\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://newtours.demoaut.com/");
		dr.findElement(By.name("userName")).sendKeys("mercury");
		dr.findElement(By.name("password")).sendKeys("mercury");
		dr.findElement(By.name("login")).click();
		dr.findElement(By.xpath("//input[@value='roundtrip']")).click();
		boolean b=dr.findElement(By.xpath("//input[@value='roundtrip']")).isSelected();
		System.out.println(b);
		WebElement c=dr.findElement(By.xpath("//select[@name='passCount']"));
		Select d= new Select(c);
		d.selectByVisibleText("1");
		WebElement e=dr.findElement(By.xpath("//select[@name='fromPort']"));
		Select f= new Select(e);
		f.selectByVisibleText("Zurich");
		WebElement g=dr.findElement(By.xpath("//select[@name='fromMonth']"));
		Select h= new Select(g);
		h.selectByVisibleText("May");
		WebElement i=dr.findElement(By.xpath("//select[@name='fromDay']"));
		Select j= new Select(i);
		j.selectByVisibleText("20");
		WebElement k=dr.findElement(By.xpath("//select[@name='toPort']"));
		Select l= new Select(k);
		l.selectByVisibleText("Sydney");
		WebElement m=dr.findElement(By.xpath("//select[@name='toMonth']"));
		Select n= new Select(m);
		n.selectByVisibleText("May");
		WebElement o=dr.findElement(By.xpath("//select[@name='toDay']"));
		Select p= new Select(o);
		p.selectByVisibleText("25");
		dr.findElement(By.xpath("//input[@value='Business']")).click();
		Boolean an=dr.findElement(By.xpath("//input[@value='Business']")).isSelected();
		System.out.println(an);
		WebElement q=dr.findElement(By.xpath("//select[@name='airline']"));
		Select r= new Select(q);
		r.selectByVisibleText("Blue Skies Airlines");
		dr.findElement(By.xpath("//input[@name='findFlights']")).click();

	}

}
