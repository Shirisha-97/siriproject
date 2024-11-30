package locators;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElements {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.get("https://www.selenium.dev/");
//		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
////		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
//		driver.findElement(By.xpath("//p[text()='Java']/../p/a[contains(text(),'Changelog')")).click();
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.xpath("//a[@name=\"women\"]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.findElement(By.xpath("//span[text()='FOREVER 21  Casual Regular Sleeves ...']/../../div/descendant::button']")).click();
		driver.findElement(By.xpath("//span[text()='FOREVER 21  Casual Regular Sleeves ...']/../../div/descendant::button[contains(text(),'add to cart')]")).click();
		
}

}
