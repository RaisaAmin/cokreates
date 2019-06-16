package Seleium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MeetingReschedule {

	public static void main(String[] args)  throws InterruptedException{
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
	    Thread.sleep(5000); 
	    driver.findElement(By.xpath("//*[text()=' Reschedule Meeting ']")).click();
	    Thread.sleep(5000);   
	    driver.findElement(By.xpath("(//i[contains(@class,'fa fa-calendar')])[4]")).click();
	    Thread.sleep(5000); 
	    driver.findElement(By.xpath("//textarea[@placeholder='Reason']")).sendKeys("For unavoidable reasons, meeting date has been changed");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//span[@ng-reflect-day='[object Object]'][contains(.,'25')]")).click();    
	    Thread.sleep(5000);	  
	    driver.findElement(By.xpath("//button[@class='btn btn-success pull-right']")).click();    

}

}
