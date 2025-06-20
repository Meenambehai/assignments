package week2.marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PVRcinemasAutomation {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.navigate().to("https://www.pvrcinemas.com/");
		driver.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();
		driver.findElement(By.id("cinema")).click();
		//Select theatre= new Select(); //INOX National,Virugambakkam Chennai
		//Select theatre = new Select(driver.findElement(By.name("p-dropdown-trigger")));
		//theatre.selectByVisibleText("INOX National,Virugambakkam Chennai");
		//driver.findElement(By.xpath("//ul/li/span[text()='INOX National,Virugambakkam Chennai']")).click();
		driver.findElement(By.xpath("//span[text()='INOX National,Virugambakkam Chennai']")).click();
		//driver.findElement(By.className("quick-left")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Today')]")).click();
		driver.findElement(By.xpath("//span[text()='SEKHAR KAMMULA S KUBERA']")).click();
		driver.findElement(By.xpath("//span[text()='11:00 PM']")).click();
		driver.findElement(By.xpath("//button[@class='p-button p-component sc-gNZgCX hrwxnG bgColor filter-btn']")).click();
		driver.findElement(By.xpath("//button[@class='sc-dkBYrC cNsERm reject-terms']")).click(); 
		driver.findElement(By.xpath("//span[@id='SL.SILVER|D:8']")).click();
		driver.findElement(By.xpath("//button[@class='sc-dJkDXt bWYhCG btn-proceeded']")).click();
		String text = driver.findElement(By.xpath("//div[@class='seat-info']")).getText();
		System.out.println(text);
		String text2 = driver.findElement(By.xpath("//span[text()='214.48']")).getText();
		System.out.println("Grand Total = "+text2);
		driver.findElement(By.xpath("//button[@class='fb-added-btndesk']")).click();
		driver.findElement(By.xpath("(//i[@class ='pi pi-times'])[2]")).click();
		String webtitle = driver.getTitle();
		System.out.println("The title of the page is " + webtitle);

	}

}
