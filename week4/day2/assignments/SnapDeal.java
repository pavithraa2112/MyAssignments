package week4.day2.assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.io.FileUtils;
import org.apache.commons.math3.analysis.function.Add;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Ordering;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Go to Mens Fashion
		WebElement element = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
		// Go to Sports Shoes
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		
		//Get the count of the sports shoes
		String count = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("Number of Sport Shoes:"+count);
		
		//Click Training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		
		//Sort by Low to High
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		driver.findElement(By.xpath("//ul[@class='sort-value']/li[2]")).click();
		
		Thread.sleep(3000);
		List<WebElement> priceList= driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		priceList.size();
		List<Integer> priceListInteger = new ArrayList<Integer>();
		for(int i=0; i<priceList.size(); i++)
		{
			String price = priceList.get(i).getAttribute("data-price");
			int Price=Integer.parseInt(price);
			priceListInteger.add(Price);
		}
		System.out.println(priceListInteger);
		
		//Check if the items displayed are sorted correctly
		if(Ordering.natural().isOrdered(priceListInteger))
		{
			System.out.println("The price list is sorted low to high");
		}
		else
		{
			System.out.println("The price list is not sorted low to high");
		}
		
		//Select the price range (900-1200)
		driver.findElement(By.className("input-filter")).clear();
		driver.findElement(By.className("input-filter")).sendKeys("900");
		Thread.sleep(2000);
		driver.findElement(By.name("toVal")).clear();
		driver.findElement(By.name("toVal")).sendKeys("1200");
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		
		//Filter with color Black and White
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Color_s-White%20%26%20Blue']")).click();
		
		// Mouse Hover on first resulting Training shoes
		Thread.sleep(2000);
		WebElement desiredShoe = driver.findElement(By.xpath("//source[@class='product-image']/following-sibling::img"));
		action.moveToElement(desiredShoe).perform();
		
		//click QuickView button
		driver.findElement(By.xpath("//div[@class='center quick-view-bar  btn btn-theme-secondary  ']")).click();
		
		//Get Price
		
		String priceOfSelectedShoe = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println("Price of the selected shoe: "+priceOfSelectedShoe);
		
		//Get Discount
		String discountofSelectedShoe = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("Discount of the selected shoe: "+discountofSelectedShoe);
		
		//File source = driver.getScreenshotAs(OutputType.FILE);
		//File dest = new File("./snaps/snapDealShoe.png");
		//FileUtils.copyDirectory(source, dest);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='sd-icon sd-icon-delete-sign'])[3]")).click();
		driver.close();
	}
}
