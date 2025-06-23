package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.navigate().to("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click(); 
		driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("NSN");
		/*driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Lakshmi");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Menon");
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("laks");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Audit");*/
		
		//driver.close();
		

	}

}
