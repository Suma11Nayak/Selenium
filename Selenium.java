package OnlineMavenProject.OnlineMavenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Selenium {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\EI13138\\Downloads\\TietoEvry - Testing stream Technical.html");
			WebDriver driver=new ChromeDriver();
		 driver.findElement(By.xpath( "//table/tbody/tr[5]/td[2]")).click();
			
		// TODO Auto-generated method stub
	}
	
	}


