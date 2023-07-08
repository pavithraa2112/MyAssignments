package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Pavithraa");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Murugaiyan");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9962237269");
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("ABCD@123");
	WebElement date= driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select select = new Select(date);
	select.selectByValue("21");
	
	WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	Select sec=new Select(month);
	sec.selectByValue("12");
	
	WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	Select sec1=new Select(year);
	sec1.selectByValue("1997");
	
	driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
	driver.close();
	
}
}
