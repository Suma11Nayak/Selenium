package OnlineMavenProject.OnlineMavenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FacebookLogin {

	public static void main(String[] args) throws Exception{
		
			 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com/reg");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@name=\"firstname\"]")).sendKeys("Suma");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@name=\"lastname\"]")).sendKeys("nayak");
				Thread.sleep(1000);
				driver.findElement(By.name("reg_email__")).sendKeys("sumanayak2000@gmail.com");
				Thread.sleep(1000);
				driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sumanayak2000@gmail.com");
				Thread.sleep(1000);
				
				
			
				driver.findElement(By.name("reg_passwd__")).sendKeys("nayakSuma11");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"day\"]")).sendKeys("1");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys("Jan");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys("2000");
				Thread.sleep(1000);
			
				driver.findElement(By.className("_8esa")).click();
			
				
				Thread.sleep(1000);
				driver.findElement(By.name("websubmit")).click();
				Thread.sleep(1000);
	
				
				
				
				
				}

				
		// TODO Auto-generated method stub

	}


