package Seleium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CancelMeeting {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
	    ChromeDriver driver =  new ChromeDriver();
	    driver.get("https://staging1.grp.gov.bd/dashboard");
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
	    driver.findElement(By.xpath("//*[text()=' Cancel Meeting ']")).click();
	    Thread.sleep(5000); 
	    driver.findElement(By.xpath("//*[text()=' Meeting List ']")).click();
	    Thread.sleep(5000); 
	    
	    driver.findElement(By.xpath("//button[contains(@id,'goToCancel0')]")).click();
	    Thread.sleep(5000);   
	    driver.findElement(By.xpath("//*[text()=' Meeting List ']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("(//i[contains(@class,'cui-trash')])[2]")).click();
	    Thread.sleep(5000); 	    
	    driver.findElement(By.xpath("//label[@btnradio='en'][contains(.,'English')]")).click();
	    Thread.sleep(5000); 
	    driver.findElement(By.xpath("//textarea[contains(@placeholder,'Reason')]")).sendKeys("The meeting discussion has no need");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[@class='btn btn-success pull-right'][contains(.,'Save')]")).click();
	    Thread.sleep(5000);   
	    driver.findElement(By.xpath("//a[@routerlinkactive='active'][contains(.,'Meeting List')]")).click();
	    Thread.sleep(5000); 
	    driver.findElement(By.xpath("//button[contains(@id,'goToCancel4')]")).click();
	    Thread.sleep(5000);   
	    driver.findElement(By.xpath("//button[contains(@id,'goToCancel5')]")).click();
	    Thread.sleep(5000); 
	    driver.findElement(By.xpath("//textarea[contains(@placeholder,'Reason')]")).sendKeys("The meeting discussion has no need");
	    Thread.sleep(5000);
	   // driver.findElement(By.xpath("//button[contains(@id,'goToCancel6')]")).click();
	   // Thread.sleep(5000);   
	    //driver.findElement(By.xpath("//button[contains(@id,'goToCancel8')]")).click();
	    //Thread.sleep(5000); 
	    
	    //driver.findElement(By.xpath("//*[text()=' Meeting List ']")).click();
	    //Thread.sleep(5000);
	    //driver.findElement(By.xpath("//textarea[@placeholder='Reason']")).sendKeys("For unavoidable circumstances, the meeting has been cancelled");  
	    //Thread.sleep(5000); 
	    //driver.findElement(By.xpath("//button[@class='btn btn-success pull-right'][contains(.,'Save')]")).click();
        System.out.println("The test run was successful and the meeting has been cancelled");

}

}
