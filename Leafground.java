package week3.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafground {

	public static void main(String[] args) 
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		
		// Click on the button with the text ‘Click and Confirm title.
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		String text = driver.findElement(By.className("route-bar-breadcrumb")).getText(); 
		//Verify that the title of the page is ‘dashboard.’
		if(text.contains("Dashboard"))
		{
		   System.out.println("The page is displayed correctly as " +text);
		}
		else
		{
			System.out.println("Different title " +text);
		}
		driver.get("https://leafground.com/button.xhtml");
		//Check if the button with the text ‘Confirm if the button is disabled’ is disabled
		boolean enabled = driver.findElement(By.name("j_idt88:j_idt92")).isEnabled();
		if(enabled==false)
		{
			System.out.println("The button is disabled");
		}
		else
		{
			System.out.println("The button is enabled");
		}
		List<WebElement> buttonscount = driver.findElements(By.xpath("//span[@class='ui-button-text ui-c\']"));
		System.out.println(buttonscount.size());
		System.out.println("*************************************************");
		//print the position of the button with the text ‘Submit.’
		Point location = driver.findElement(By.xpath("//span[text()='Submit']")).getLocation();
		System.out.println("Finding position using getLocation method " +location);
		System.out.println("*******************************************");
		System.out.println("To print the positons of Submit buttons");
		
		for (WebElement webElement : buttonscount) 
		{
			//System.out.println(webElement.getText());
			if (webElement.getText().equalsIgnoreCase("Submit"))
			{
				System.out.println(buttonscount.indexOf(webElement));
			}
		
		}
		//print the background color of the button with the text ‘Find the Save button color
		String cssValue = driver.findElement(By.name("j_idt88:j_idt96")).getCssValue("background-color");
		System.out.println("Background color " +cssValue);
		//print the height and width of the button with the text ‘Find the height and width of this button
		System.out.println("************************************************");
		Dimension size = driver.findElement(By.name("j_idt88:j_idt98")).getSize();
		System.out.println("Height and width =" +size);
		driver.close();
	}

}
