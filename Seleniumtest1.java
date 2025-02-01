package guvitask9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumtest1 {

	public static void main(String[] args) {

		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("The website Title is: "+ title);
		
		//check the title is correct using if else
		if(title.equals("STORE"))
		{
			System.out.println("Page landed on correct website");
		}else
		{
			System.out.println("Page not landed on correct website ");
		}
		
		
		driver.navigate().refresh();
		//driver.close();
		
	}

}
//OUTPUT
//The website Title is: STORE
//Page landed on correct website