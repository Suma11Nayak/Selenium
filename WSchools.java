package OnlineMavenProject.OnlineMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WSchools {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			String result=driver.findElement(By.xpath( "//table/tbody/tr[3]/td[1]")).getText();
			System.out.println(result);
			
	}
		// TODO Auto-generated method stub

	}


