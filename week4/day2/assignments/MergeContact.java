package week4.day2.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		//To get parent window Handle
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println(parentWindowHandle);
		driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdFrom']/following-sibling::a")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> listofWindows = new ArrayList<>(windowHandles);
		
		System.out.println(listofWindows.size());
		
		//Switch to parent window 
		driver.switchTo().window(listofWindows.get(1));
		driver.manage().window().maximize();
		
		//To get child window Handle
		String childWindowHandle = driver.getWindowHandle();
		
		System.out.println(childWindowHandle);
		
		driver.findElement(By.linkText("11594")).click();
		
		driver.switchTo().window(listofWindows.get(0));
		
		driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdTo']/following-sibling::a")).click();
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		
		List<String> listofWindows1 = new ArrayList<>(windowHandles1);
		
		driver.switchTo().window(listofWindows1.get(1));
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("11595")).click();
		
		driver.switchTo().window(listofWindows1.get(0));
		
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		
		driver.switchTo().alert().accept();
		
		String title= driver.getTitle();
		
		System.out.println(title);
		
		
		
	
		
		
		
		
	}
}
