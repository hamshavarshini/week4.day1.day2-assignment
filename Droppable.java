package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Droppable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement item2 = driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[1]"));
		WebElement item6 = driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[5]"));
		Point location = item6.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println(x);
		System.out.println(y);
		Actions action= new Actions(driver);
		
		action.dragAndDropBy(item2, x, y).build().perform();
		
	}

}
