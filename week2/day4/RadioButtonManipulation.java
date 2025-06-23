package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonManipulation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.navigate().to("https://www.leafground.com/radio.xhtml");
		boolean selected = driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default'])[11]")).isSelected();
		//System.out.println(selected);
		if(selected == false)
		{
			System.out.println("safari Radio button is not enabled ");
		}
		driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[11]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[10]")).click();
		boolean selectedage = driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active'])[5]")).isEnabled();
		System.out.println(selectedage);
		if (selectedage== true)
		{
			System.out.println("The age group 21-40 is already selected");
		}
		driver.close();
	}

}
