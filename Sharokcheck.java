package Seleium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sharokcheck {

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
	    driver.findElement(By.xpath("//*[text()=' Create Meeting ']")).click();
	    Thread.sleep(5000);  
	    driver.findElement(By.xpath("//label[@btnradio='en'][contains(.,'English')]")).click();
	    Thread.sleep(5000);
	
}

}