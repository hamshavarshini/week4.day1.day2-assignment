package week4.day1;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leafground.com/pages/frame.html");
		WebElement goToClickMe = driver.findElement(By.id("ClickMe"));
		File src = goToClickMe.getScreenshotAs(OutputType.FILE);
		File dst = new File("./snaps/pic.png");
		FileUtils.copyFile(src, dst);
	}

}
