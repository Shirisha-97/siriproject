package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MypropertFileRead {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./driver.chromedriver.exe");
		//we will use this step in order to read the data from the peoperty file
		//and also what ever data is present in propert file will be string format and need to be converted into object format
		FileInputStream fis=new FileInputStream("./mypropertyfolder/mydata.properties");
		//we use this below step to read or write all file properties we use this class
		
	Properties propert=new Properties();
	//since this propert is null we provide this load the object
		propert.load(fis);
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(propert.getProperty("url"));
		driver.findElement(By.name("loginBtn")).click();
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys(propert.getProperty("emailid"));
		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys(propert.getProperty("password"));
		driver.findElement(By.xpath("//span[text()=\"Login\"]")).click();
		
		
		
		
		
	}
	

}
