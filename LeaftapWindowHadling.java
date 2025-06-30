package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeaftapWindowHadling {

	public static void main(String[] args) throws InterruptedException {
		
		//Initialize chrome driver
		ChromeOptions option =new ChromeOptions();
		option.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.xpath("(//div[@class='x-panel-header']/a)[3]")).click();
		driver.findElement(By.xpath("//li/a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();
		System.out.println(driver.getTitle());
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		System.out.println("Current window title - " +driver.getTitle());
		driver.findElement(By.linkText("14420")).click();
		driver.switchTo().window(windows.get(0));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		System.out.println("current window title - " +driver.getTitle());
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String>windows1 = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(windows1.get(1));
		System.out.println("current window title - " +driver.getTitle());
		Thread.sleep(1000);
		driver.findElement(By.linkText("14421")).click();
		driver.switchTo().window(windows.get(0));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		driver.switchTo().alert().accept();
		System.out.println(driver.getTitle());
		
	}

}
