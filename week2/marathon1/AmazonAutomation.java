package week2.marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutomation {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		//driver.findElement(By.className("a-button-text")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags for Boys");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String text = driver.findElement(By.xpath("//span[contains(text(),'results')]")).getText();
		System.out.println(text +" bags for boys");
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[6]")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("(//span[text()='Safari']")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='a-button a-button-dropdown a-button-small']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Newest Arrivals")).click();
		String text2 = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base']")).getText();
		System.out.println("The Brand of the bag is "+ text2);
		String text3 = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("The price of the bag is "+ text3);
		String pagetitle= driver.getTitle();
		System.out.println("The page title is " +pagetitle);
		//driver.close();
		
	}

}
