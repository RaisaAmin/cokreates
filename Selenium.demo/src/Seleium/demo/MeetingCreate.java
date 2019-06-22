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
	    driver.findElement(By.xpath("//a[@class='nav-link nav-dropdown-toggle'][contains(.,'Meeting Management')]")).click();
	    Thread.sleep(5000);  
	    driver.findElement(By.xpath("//a[@class='nav-link nav-dropdown-toggle'][contains(.,'Pre Meeting task')]")).click();
	    Thread.sleep(5000); 
	    driver.findElement(By.xpath("//a[@routerlinkactive='active'][contains(.,'Create Meeting')]")).click();
	    Thread.sleep(5000); 	 
	    driver.findElement(By.xpath("//label[contains(.,'English')] ")).click();
	    Thread.sleep(5000); 
	    driver.findElement(By.xpath("(//input[contains(@type,'text')])[3]")).sendKeys("444.321");  
	    Thread.sleep(7000); 
	    driver.findElement(By.xpath("//textarea[@placeholder='Title']")).sendKeys("GRP regular meeting");  
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("(//div[contains(@class,'placeholder ng-star-inserted')])[2]")).click();  
	    Thread.sleep(5000); 	
	    driver.findElement(By.xpath("//span[@class='ng-star-inserted'][contains(.,'PSC')]")).click();      
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[@class='placeholder ng-star-inserted'][contains(.,'Chairperson')]")).click();      
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//li[contains(.,'রাইসা  আমিন-প্রশিক্ষণ ও উন্নয়ন')]")).click();      
	    Thread.sleep(5000);	    
	    driver.findElement(By.xpath("//div[@class='placeholder ng-star-inserted'][contains(.,'Signing Authority')]")).click();   
	    Thread.sleep(5000);	    
	    driver.findElement(By.xpath("//span[contains(.,'Niloy Karmaker-ডেভেলপমেন্ট')]")).click();      
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("//div[@class='placeholder ng-star-inserted'][contains(.,'Room')]")).click();  
	    Thread.sleep(5000); 
	    driver.findElement(By.xpath("//span[contains(.,'Mini-Conference Room (10)')]")).click();  
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[contains(@name,'meetingDate')]")).click();  
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//span[@ng-reflect-day='[object Object]'][contains(.,'20')]")).click();  
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("(//span[contains(@class,'bs-chevron bs-chevron-up')])[1]")).click(); 
	    Thread.sleep(5000); 
	    driver.findElement(By.xpath("(//a[contains(@class,'btn btn-link')])[5]")).click();
	    Thread.sleep(5000); 
	    
	    driver.findElement(By.xpath("(//button[contains(@class,'btn btn-pill btn-outline-primary')])[4]")).click();  
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("(//textarea[@placeholder='Agenda'])[1]")).sendKeys("topic1");  
	    Thread.sleep(5000); 
	    driver.findElement(By.xpath("//button[contains(@id,'addAgenda')]")).click();  
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("(//button[@class='btn btn-pill btn-outline-primary'])[4]")).click();  
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@placeholder='Working Paper, Concept Note etc...']")).sendKeys("Working paper 1");  
	    Thread.sleep(5000);
	    //driver.findElement(By.xpath("//input[@ng-reflect-name='selectfile']")).sendKeys("C:\\Users\\Lenovo\\Desktop\\thess\\Citation Examples_MLA.pdf");
	    //Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();  
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//a[@routerlinkactive='active'][contains(.,'Meeting List')]")).click();  
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//a[contains(@id,'meeting0')]")).click();  
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[contains(@ng-reflect-tooltip,'Send Notice for Approval')]")).click();  
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[contains(@name,'title')]")).sendKeys("Notice file 1");  
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@placeholder='Select a file']")).sendKeys("C:\\Users\\Lenovo\\Desktop\\thess\\BRACU_Thesis_sample_template.pdf"); 
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[contains(.,'Forward for GRP approval')]")).click(); 
	    Thread.sleep(5000);//button[contains(.,'Request for Approval')]
	    driver.findElement(By.xpath("//a[@ng-reflect-router-link='/dashboard/meetings/list']")).click(); 
	    Thread.sleep(5000);
	    System.out.println("The test case ran successfully and a meeting has been created");
	    //driver.findElement(By.xpath("//input[@placeholder='name,designation,office']")).sendKeys("d");
	    //Thread.sleep(5000);
	    //driver.findElement(By.xpath("//li[@class='ng-tns-c27-17 ng-star-inserted ui-autocomplete-list-item ui-corner-all ui-state-highlight']")).click(); 
	    //Thread.sleep(5000);//button[contains(.,'Add')]
	    //driver.findElement(By.xpath("//button[contains(.,'Add')]")).click();
	    //Thread.sleep(5000);
	    //driver.findElement(By.xpath("//button[@class='btn btn-success pull-right'][contains(.,'Save')]")).click();
	    //Thread.sleep(5000);
	    
	    
	}

}