package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadFromProperties {
// Read operation
//	public static void main(String[] args) throws IOException {
//		FileInputStream fis = new FileInputStream("./testData/data.properties");
//		Properties property = new Properties();
//		property.load(fis);
//		
//		System.out.println(property.getProperty("url"));
//	}
	
	// execution
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("./testData/data.properties");
		Properties property = new Properties();
		property.load(fis);
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		long time = Long.parseLong(property.getProperty("time"));
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		
		driver.get(property.getProperty("url"));
		
		driver.findElement(By.name("email")).sendKeys(property.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(property.getProperty("password"));
		driver.findElement(By.id("last")).click();
		
		Thread.sleep(2000);
		driver.close();
	}

}
