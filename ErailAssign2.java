package selenium;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailAssign2 {

	public static void main(String[] args) throws InterruptedException {
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
			Thread.sleep(2000);
			List<WebElement> train = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]/a"));
	System.out.println(train.size());
	HashSet<String> trainName= new HashSet<String>();
	for (WebElement setTrain : train) {
		trainName.add(setTrain.getText());	
	}
	System.out.println(trainName.size());
	
	}

}
