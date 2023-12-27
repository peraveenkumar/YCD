package mavenTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Test01 {

	@Test
//public static void main(String[] args) throws InterruptedException {
	public static void login() throws InterruptedException {
		
		
		//System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		  
        // Launching website 
        driver.get("https://www.google.com/"); 
        
        Thread.sleep(3000);
        
        System.out.println("THIS TEST IS SUCCESSFUL");        
        driver.quit();

	}

}
