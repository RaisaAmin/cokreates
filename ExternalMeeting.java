package Seleium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExternalMeeting {

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
	    driver.findElement(By.xpath("//*[text()=' External Meeting ']")).click();
	    Thread.sleep(5000);   
	    driver.findElement(By.xpath("//*[text()=' Add ']")).click();
	    Thread.sleep(5000); 
	    driver.findElement(By.xpath("//input[@placeholder='Enter Office Name']")).sendKeys("Creative IT Company");  
	    Thread.sleep(5000); 
	    driver.findElement(By.xpath("//input[@placeholder='Enter Meeting Reference']")).sendKeys("234.567.555.443");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter Meeting Title']")).sendKeys("General meeting 1");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter Meeting Type']")).sendKeys("Important");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter Meeting Room']")).sendKeys("BCC");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter Meeting Chairperson']")).sendKeys("Mr. Chairperson");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='meetingDate']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(5000);
	    //driver.findElement(By.xpath("//button[@class='btn btn-primary pull-right'][contains(.,'Back To List')]")).click();
        System.out.println("The test case ran successfully and an external meeting has been created");
	}
}
