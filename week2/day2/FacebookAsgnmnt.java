package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAsgnmnt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://en-gb.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Deera");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("vishaakan");
		Select date = new Select(driver.findElement(By.name("birthday_day")));
		date.selectByIndex(10);
		Thread.sleep(1000);
		Select month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByIndex(3);
		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByValue("1990");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9566280181");
		driver.findElement(By.id("password_step_input")).sendKeys("deera@123");
		Thread.sleep(2000);
		driver.close();
		System.out.println("Work done");
		
	}

}
