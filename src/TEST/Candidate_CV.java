package TEST;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Candidate_CV {
	static int count = 0;
	
	public static void all_print(int n) throws Exception {
		do {
			WebDriverWait wait = new WebDriverWait(Information.driver, 10);
			List<WebElement> list = Information.driver.findElements(By.xpath("//div[@class='list-resume']/div/div/div/div[2]"));
			wait.until(ExpectedConditions
					.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='list-resume']/div/div/div/div[2]")));
			for (int j = 0; j < list.size(); j++) {
				if (count < n) {
					System.out.println("CV " + count + "--------------------------------------------");
					String v = list.get(j).getText();
					System.out.println(v + "\n");
				}
				count++;
			}
			JavascriptExecutor js = ((JavascriptExecutor) Information.driver);
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			WebElement next =Information.driver
					.findElement(By.xpath("//li[@class='page-item page-nav page-next']//a[@class='page-link']/i"));
			next.click();
			Thread.sleep(3000);
		} while (count < n);
	}
	
}
