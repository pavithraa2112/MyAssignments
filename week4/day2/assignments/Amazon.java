package week4.day2.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		//Get the price of the first product
		String Price= driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("Price of the mobile:"+Price);
		
		//driver.findElement(By.xpath("//i[@class='a-icon a-icon-popover']")).click();
		//String Ratings = driver.findElement(By.xpath("//span[contains(@class,'a-text-beside-button')]")).getText();
		//System.out.println(Ratings);
		
		//Click the first text link of the first image
		driver.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")).click();
		
		//Click 'Add to Cart' button
		Set<String>  windows = driver.getWindowHandles();
		List<String> windowsList = new ArrayList<String>(windows);
		driver.switchTo().window(windowsList.get(1));
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		//Get the cart subtotal 
		Thread.sleep(3000);
		String cartTotal = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-price a-text-bold']/span")).getText();
		System.out.println(cartTotal);
		
		//close the browser
		driver.close();
		
	}
}
