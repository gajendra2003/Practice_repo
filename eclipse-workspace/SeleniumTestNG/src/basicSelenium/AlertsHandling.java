package basicSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertsHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gajju\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver dr=new ChromeDriver();
        dr.manage().window().maximize();
        dr.get("file:///C:\\Users\\gajju\\Downloads\\Practice.html");
        Select sel=new Select(dr.findElement(By.id("anand")));
        sel.selectByIndex(2);
        sel.selectByIndex(3);
        sel.selectByIndex(4);
        sel.deselectAll();
        JavascriptExecutor js= (JavascriptExecutor) dr; 
        WebElement ele=dr.findElement(By.tagName("button"));
        js.executeScript("arguments[0].scrollIntoView();",ele);
        ele.click();
        Alert al= dr.switchTo().alert();
       String str= al.getText();
       System.out.println(str);
       al.dismiss();

	}

}
