package Seleium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MeetingList {

	public static void main(String[] args) throws InterruptedException{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
			    ChromeDriver driver =  new ChromeDriver();
			    driver.get("https://grp.gov.bd/dashboard");
			    driver.manage().window().maximize();
			    driver.findElement(By.id("hf-user-name")).sendKeys("meeting_admin");
			    driver.findElement(By.id("hf-user-password")).sendKeys("meeting_admin");  
			    driver.findElement(By.id("loginSubmit")).click(); 
			    Thread.sleep(5000);
			    driver.findElement(By.xpath("//*[text()=' Meeting Management ']")).click();
			    //driver.findElement(By.xpath("//*[@class='app-body']//following::a[1]")).click();
			    Thread.sleep(2000);  
			    driver.findElement(By.xpath("//*[text()=' Pre Meeting task ']")).click();
			    Thread.sleep(2000); 
			    driver.findElement(By.xpath("//*[text()=' Meeting List ']")).click();
			    Thread.sleep(5000); 
			    driver.findElement(By.xpath("//a[@routerlink='/dashboard/meetings/new-meeting/view'][contains(.,'asfaa')]")).click();
			    Thread.sleep(5000);
			    driver.findElement(By.xpath("//i[contains(@class,'cui-pencil ')]")).click(); 
			    Thread.sleep(5000);
			    driver.findElement(By.xpath("//button[contains(@class,'btn btn-pill custom-btn-outline-info pull-right ng-star-inserted')]")).click(); 
			    Thread.sleep(5000);
			    driver.findElement(By.xpath("//li[contains(@class,'highlighted ng-star-inserted')]")).click(); 
			    Thread.sleep(5000);
			    driver.findElement(By.xpath("//span[@class='ng-tns-c23-4 ng-star-inserted'][contains(.,'external_guest')]")).click(); 
			    Thread.sleep(5000);
			    driver.findElement(By.xpath("//textarea[@placeholder='Note']")).sendKeys("Some notes");   
			    Thread.sleep(5000);
			    driver.findElement(By.xpath("//button[@class='btn btn-success pull-right'][contains(.,'Add')]")).click(); 
			    Thread.sleep(5000);
			    driver.findElement(By.xpath("//i[contains(@class,'cui-people ')]")).click(); 
			    Thread.sleep(5000);//span[@class='ng-tns-c23-10 ng-star-inserted'][contains(.,'arif , DG , O')]
			    
			    driver.findElement(By.xpath("//span[@class='ng-tns-c23-10 ng-star-inserted'][contains(.,'arif , DG , O')]")).click(); 
			    Thread.sleep(5000);//button[@class='btn btn-secondary'][contains(.,'Close')]
			    
			    driver.findElement(By.xpath("//button[@class='btn btn-secondary'][contains(.,'Close')]")).click(); 
			    Thread.sleep(5000);
			    driver.findElement(By.xpath("//button[@class='btn btn-success pull-right'][contains(.,'Save')]")).click(); 
			    Thread.sleep(5000);
			    
			  

	}

}
