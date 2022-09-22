package OnlineMavenProject.OnlineMavenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HRMlogin {
	public static void main(String[]args) throws Exception {
		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\'username\']")).sendKeys("Admin");
	Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type=\'password\']")).sendKeys("admin123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type=\'submit\']")).click();
		
		
		}
		
}

		

	

