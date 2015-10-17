package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebAppTesting {

	public static void main(String[] args) {
System.out.println("Helooooooooooooo");
WebDriver driver=new FirefoxDriver();
driver.get("http://www.indianrail.gov.in/seat_Avail.html");
driver.findElement(By.id("lccp_trnno")).sendKeys("123");
driver.findElement(By.id("lccp_srccode")).sendKeys("1234");
driver.findElement(By.id("lccp_dstncode")).sendKeys("12345");
driver.findElement(By.name("submit")).click();
	}

}
