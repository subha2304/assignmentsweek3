package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {
	

	public static void main(String[] args) {
		//public static void main(String[] args) {
	          WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://erail.in/");
			driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
			WebElement element = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
			element.sendKeys(Keys.CONTROL + "A");
			 element.sendKeys(Keys.DELETE);	
			driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("mumbai");
			driver.findElement(By.xpath("//div[@title='Navi-Mumbai']")).click();
			driver.findElement(By.id("txtStationTo")).clear();
			driver.findElement(By.id("txtStationTo")).sendKeys("delhi");
			driver.findElement(By.xpath("//div[@title='Delhi Cantt']")).click();
			List<WebElement> train = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]/a"));
			List<String> trainName = new ArrayList<String>();
			for(int i = 0;i<train.size();i++) {
			trainName.add(train.get(i).getText());
			}
			Collections.sort(trainName);
			System.out.println(trainName);						
	}

}
