package methodselect;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class methoddraganddropby 
{
	public static void main(String[] args)
	{
				WebDriver driver =new ChromeDriver(); 
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://jqueryui.com/draggable/");
				driver.switchTo().frame(0);
				WebElement source = driver.findElement(By.id("Draggable"));
				Actions a =new Actions(driver);
				a.dragAndDropBy(source, 20, 30);
				a.perform();
	}
}
