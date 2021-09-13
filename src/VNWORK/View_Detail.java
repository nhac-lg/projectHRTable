package VNWORK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class View_Detail {
	public static void detail(WebDriver driver) throws InterruptedException {
		
		WebElement view= driver.findElement(By.xpath("//div[@class='row']//div[1]//div[1]//div[1]//div[3]//div[1]//a[1]"));
		view.click();
		Thread.sleep(4000);
		
		WebElement web = driver.findElement(By.xpath("//iframe[@id='resumeIframe']"));
		driver.switchTo().frame(web);
		System.out.println(web.getAttribute("src"));
//		driver.findElement(By.xpath("//iframe[@id='resumeIframe']")).getAttribute("src");
//		System.out.println(driver.findElement(By.xpath("//iframe[@id='resumeIframe']")).getAttribute("src"));
//		driver.switchTo().parentFrame();
	}
}
