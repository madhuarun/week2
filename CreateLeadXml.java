package week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.xmlbeans.XmlAnySimpleType;


public class CreateLeadXml {
	

		public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
				
		ChromeDriver driver=new ChromeDriver();
				
		driver.get("http://leaftaps.com/opentaps/control/main");
	
		
		driver.manage().window().maximize();
		
	
	
	driver.findElement (By.xpath ("//input[ @id='username']")).sendKeys("DemoCSR");

	driver.findElement (By.xpath ("//input[ @id='password']")).sendKeys("crmsfa");
	
	driver.findElement(By.xpath("//input[ @value='Login']")).click();
	driver.findElement(By.xpath("//div[@for='crmsfa']/a")).click();
	driver.findElement(By.xpath("//a[text()='Leads']")).click();
	driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	driver.findElement (By.xpath ("//input[ @class='inputBox' and @name='companyName']")).sendKeys("omnex");
	driver.findElement (By.xpath ("//input[ @class='inputBox' and @name='firstName']")).sendKeys("madhu");
	driver.findElement (By.xpath ("//input[ @class='inputBox' and @name='lastName']")).sendKeys("arun");
	driver.findElement (By.xpath ("//input[ @name='departmentName']")).sendKeys("QA");
	driver.findElement (By.xpath ("//textarea[@id='createLeadForm_description']")).sendKeys("This a trial");
	driver.findElement (By.xpath ("//input[ @id='createLeadForm_primaryEmail']")).sendKeys("testleaf@hotmail.com");
	
	
	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

String title=driver.getTitle();
System.out.println(title);
	
		}


}