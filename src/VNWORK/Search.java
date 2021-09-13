package VNWORK;

import java.util.List;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Search {
	
	public static boolean existsElement(String id) {
	    try {
	    	Information.driver.findElement(By.xpath(id));
	    } catch (NoSuchElementException e) {
	        return false;
	    }
	    return true;
	}
	
	public static void clicksearch() {
		Information.driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/a[2]/span[1]")).click();
	}
	
	public static boolean set_categori(String text) {
		Information.driver.findElement(By.xpath("//input[@placeholder='Choose categories...']")).sendKeys(text);
		List<WebElement> List = Information.driver.findElements(By.xpath("//ul[@id='select2-category-results']/li"));
		for (WebElement li : List) {
			if (li.getText().equals(text)) {
				li.click();
				return true;
			}
		}
		return false;
	}
	
	public static boolean set_working_location(String text) {
		Information.driver.findElement(By.xpath("//input[@placeholder='Choose locations...']")).sendKeys(text);
		List<WebElement> List = Information.driver.findElements(By.xpath("//ul[@id='select2-location-results']/li"));
		for (WebElement li : List) {
			if (li.getText().equals(text)) {
				li.click();
				return true;
			}
		}
		return false;
	}

	public static boolean set_home_address(String text) {
		Information.driver.findElement(By.xpath("//span[@id='select2-homeaddress-container']")).click();
		Information.driver.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']//input[@role='textbox']"))
				.sendKeys(text);
		List<WebElement> List = Information.driver.findElements(By.xpath("//ul[@id='select2-homeaddress-results']"));
		for (WebElement li : List) {
			if (li.getText().equals(text)) {
				li.click();
				return true;
			}
		}
		return false;
	}

	public static boolean set_last_resume(String text) {
		Information.driver.findElement(By.xpath("/html[1]/body[1]/div[8]/div[1]/div[1]/"
				+ "div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/span[1]/span[1]/span[1]/span[1]")).click();
		List<WebElement> List = Information.driver.findElements(By.xpath("//*[@class='select2-results__options']/li"));
		for (WebElement li : List) {
			if (li.getText().equals(text)) {
				li.click();
				return true;
			}
		}
		return false;
	}

	public static boolean set_job_level(String text) {
		Information.driver.findElement(By.xpath("/html[1]/body[1]/div[8]/div[1]/div[1]/"
				+ "div[1]/div[1]/div[1]/div[1]/div[2]/div[8]/span[1]/span[1]/span[1]/span[1]")).click();
		List<WebElement> List = Information.driver.findElements(By.xpath("//*[@class='select2-results__options']/li"));
		for (WebElement li : List) {
			if (li.getText().equals(text)) {
				li.click();
				return true;
			}
		}
		return true;
	}

}
