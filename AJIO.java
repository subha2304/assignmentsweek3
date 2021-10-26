package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AJIO {
	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://WWW.ajio.com/");
		driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("bags");


driver.findElement(By.xpath("//span[@class='ic-search']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
System.out.println(text);
Thread.sleep(2000);
driver.findElement(By.xpath("//span[text()='brands']")).click();
List<WebElement> brands = driver.findElements(By.xpath("//span[text()='brands']/following::div[@class='facet-body']//label[contains(@class,'facet-linkname')]"));

for (WebElement brandName : brands) {
	System.out.println(brandName.getText());
	
}
Thread.sleep(2000);
driver.findElement(By.xpath("(//div[@id='verticalsizegroupformat'])[2]")).click();
List<WebElement> bags = driver.findElements(By.xpath("//div[@class='facet-filter-modal__body']/ul/li"));
for (WebElement bagNames : bags) {
	System.out.println(bagNames.getText());
	
}
	}

}
