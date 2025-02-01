package guvitask9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniumtast {

	public static void main(String[] args) {
		
		
		
		
		//Initialize the Browser
		WebDriver driver = new FirefoxDriver();
		
		// Get the URL 
		driver.get("http://google.com");
		
		//Maximize the website
		driver.manage().window().maximize();
		
		String CurrentURL=driver.getCurrentUrl();
		System.out.println("My Current URL is:" +CurrentURL);
		
		driver.navigate().refresh();
		//driver.close();
		

	}

}

//output

//My Current URL is:https://www.google.com/?gws_rd=ssl
