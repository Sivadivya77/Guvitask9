package guvitask9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumtest2 {

	public static void main(String[] args) {
             
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("search")).sendKeys("Artificial intelligence");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.linkText("History")).click();
		
		String title =driver.getTitle();
		System.out.println(title);
	}

}
//OUTPUT
//Artificial intelligence - Wikipedia