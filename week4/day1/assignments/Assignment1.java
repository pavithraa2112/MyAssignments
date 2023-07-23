package week4.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--diable-notifications");
		ChromeDriver driver = new ChromeDriver(Options);
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//div[@class='hxt-spm-clickable']")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("URBAN FIT X SMART WATCH")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='hxt-spm-clickable']")).click();
		//switch to frame
		driver.switchTo().frame("dummy-chat-button-iframe");
		driver.findElement(By.id("dummy-chat-button")).click();
		
		driver.switchTo().frame("ShopifyChat");
		driver.findElement(By.xpath("//button[contains(@class,'chat-app--close-button')]")).click();
		
		driver.switchTo().defaultContent();

		
	}
}
