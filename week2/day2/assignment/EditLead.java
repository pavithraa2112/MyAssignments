package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@class=' x-form-text x-form-field ']")).sendKeys("Pavithraa");
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys("13724");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[text()='Edit']")).click();
	driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
	driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Delloite");
	Thread.sleep(5000);
	driver.findElement(By.className("smallSubmit")).click();
	WebElement e = driver.findElement(By.id("viewLead_companyName_sp"));
	System.out.println(e.getText());
	driver.close();
	
}
}
