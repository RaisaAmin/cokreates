package Seleium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MeetingTimeTaskAttendance {

	public static void main(String[] args)throws InterruptedException{
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
	    driver.findElement(By.xpath("//*[text()=' Meeting Time Task ']")).click();
	    Thread.sleep(5000); 
	    driver.findElement(By.xpath("//*[text()=' Attendance ']")).click();
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("(//span[contains(@class,'slider round')])[2]")).click();
	    Thread.sleep(5000); 
	    driver.findElement(By.xpath("//input[@placeholder='Honorarium']")).sendKeys("80000"); 
	    Thread.sleep(5000); 
	    driver.findElement(By.xpath("//button[contains(@id,'modalsaveBtn')]")).click();
	    Thread.sleep(5000); 
	    driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary pull-right'][contains(.,'Finish')]")).click();
	  	    
}

}
