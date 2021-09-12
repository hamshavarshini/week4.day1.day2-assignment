package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/sortable/");
		driver.switchTo().frame(0);
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement item6 = driver.findElement(By.xpath("//li[text()='Item 6']"));
		Point loc3 = item3.getLocation();
		int x3 = loc3.getX();
		int y3 = loc3.getY();
		Point loc6 = item6.getLocation();
		int x6 = loc6.getX();
		int y6 = loc6.getY();
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(item1, x3, y3).perform();
		builder.dragAndDropBy(item2, x6, y6).perform();
	}

}
