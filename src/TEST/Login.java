package TEST;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;

public class Login {
	
	public static void login(String username, String pass) {
		Information.driver.findElement(By.id("username")).sendKeys(username);
		Information.driver.findElement(By.id("password")).sendKeys(pass);
		//Information.driver.findElement(By.xpath("//input[@id='remember_me']")).click();
		Information.driver.findElement(By.id("btnLogin")).click();
	}
	
	public static boolean existsElement(String id) {
	    try {
	    	Information.driver.findElement(By.id(id));
	    } catch (NoSuchElementException e) {
	        return false;
	    }
	    return true;
	}
	
}
