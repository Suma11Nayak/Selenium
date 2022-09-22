package OnlineMavenProject.OnlineMavenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FunctionHRM {
WebDriver driver=new ChromeDriver();

		
			void login()throws InterruptedException {
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@name=\'username\']")).sendKeys("Admin");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@type=\'password\']")).sendKeys("admin123");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@type=\'submit\']")).click();
		
			}
			   
			
			
			void Search(String username) throws InterruptedException{
				
		    driver.findElement(By.xpath("//a/span")).click();
		   
			driver.findElement(By.xpath("//div[2]/input")).sendKeys(username);
	
			driver.findElement(By.xpath("//button[@type= 'submit']")).click();
			}
			
		
		void Data(String userrole, String empName)throws InterruptedException{
		{
			driver.findElement(By.xpath("//div[2]/div/div[2]/div/div")).sendKeys(userrole);
	
			driver.findElement(By.xpath("//input[@placeholder=\'Type for hints...']")).sendKeys(empName);
		
			
			driver.findElement(By.xpath("//button[@type= 'submit']")).click();
		}
		}

	public static void main(String[]args) throws Exception {
		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
		FunctionHRM obj=new FunctionHRM();
	obj.login();
	obj.Search("Admin");
	obj.Data("Admin", "paul Collings");
	}
	

	}


