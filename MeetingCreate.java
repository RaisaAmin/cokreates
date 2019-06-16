package Seleium.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class MeetingCreate {

	//private static final WebElement DropDownElementLocator = null;

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
	    Thread.sleep(5000);  
	    driver.findElement(By.xpath("//*[text()=' Pre Meeting task ']")).click();
	    Thread.sleep(5000); 
	    driver.findElement(By.xpath("//*[text()=' Create Meeting ']")).click();
	    Thread.sleep(5000); 	  
	    driver.findElement(By.xpath("//input[contains(@ng-reflect-name,'reference')]")).sendKeys("900");  
	    Thread.sleep(5000); 
	    driver.findElement(By.xpath("//textarea[contains(@placeholder,'Title')]")).sendKeys("GRP regular meeting");  
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("(//div[@class='placeholder ng-star-inserted'][contains(.,'Type')])[1]")).click();  
	    Thread.sleep(5000); 	  
	    driver.findElement(By.xpath("//span[@class='ng-star-inserted'][contains(.,'Meeting and event development team')]")).click();  
	    Thread.sleep(5000); 
	    driver.findElement(By.xpath("//div[@class='placeholder ng-star-inserted'][contains(.,'Committee')]")).sendKeys("Committee 1");    
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[@class='placeholder ng-star-inserted'][contains(.,'Chairperson')]")).click();  
	    Thread.sleep(5000); 
	    driver.findElement(By.xpath("//span[@class='ng-star-inserted'][contains(.,'Test Employee-প্রশাসন')]")).click();  
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[@class='placeholder ng-star-inserted'][contains(.,'Signing Authority')]")).click();  
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//span[@class='ng-star-inserted'][contains(.,'Test Employee-প্রশাসন')]")).click();  
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[@class='placeholder ng-star-inserted'][contains(.,'Room')]")).click();  
	    Thread.sleep(5000); 
	    driver.findElement(By.xpath("//span[@class='ng-star-inserted'][contains(.,'Conference Room 101 (90)')]")).click();  
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//span[@ng-reflect-day='[object Object]'][contains(.,'17')]")).click();  
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[@class='card-header'][contains(.,'Agenda  (0)')]")).click();  
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//textarea[contains(@id,'agenda')]")).sendKeys("agenda1");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("(//i[contains(@class,'fa fa-plus')])[2]")).click();  
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[@class='btn btn-success pull-right ng-star-inserted'][contains(.,'Save')]")).click();  
	    Thread.sleep(5000);
	    
	    
	}

}