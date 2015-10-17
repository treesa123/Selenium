package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttributeWebapp {

	public static void main(String[] args) {
WebDriver driver=new FirefoxDriver();
driver.get("http://www.indianrail.gov.in/seat_Avail.html");
driver.findElement(By.id("lccp_dstncode")).sendKeys("123");
System.out.println(driver.findElement(By.id("lccp_dstncode")).getAttribute("placeholder"));
//System.out.print(tt);
	}

}
