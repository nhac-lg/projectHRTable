package VNWORK;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class List_Capture_Candidate {

	static int count = 0;
	static List<Candidate> ds = new ArrayList<>();

	public static void all_print(int n) throws Exception {
		do {
			WebDriverWait wait = new WebDriverWait(Information.driver, 10);
			List<WebElement> list = Information.driver
					.findElements(By.xpath("//div[@class='list-resume']/div/div/div/div[2]"));
			wait.until(ExpectedConditions
					.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='list-resume']/div/div/div/div[2]")));
			System.out.println("so luong: " + (list.size() + count));
			for (int j = 0; j < list.size(); j++) {
				if (count < n) {
					String v = list.get(j).getText();
					ds.add(handing_string(v));
				}
				count++;

			}
			JavascriptExecutor js = ((JavascriptExecutor) Information.driver);
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			WebElement next = Information.driver
					.findElement(By.xpath("//li[@class='page-item page-nav page-next']//a[@class='page-link']/i"));
			next.click();
			Thread.sleep(3000);
		} while (count < n);
	}

	public static Candidate handing_string(String str) {
		String name = "", pos = "", company = "", year = "", salary = "", location = "";
		String[] lines = str.split("\\r?\\n");
		for (int i = 0; i < lines.length; i++) {
			name = lines[0];
			pos = lines[1];
			if (lines[i].equalsIgnoreCase("Latest company:")) {
				company = lines[i + 1];
			}
			if (lines[i].equalsIgnoreCase("Years of experience: ")) {
				year = lines[i + 1];
			}
			if (lines[i].equalsIgnoreCase("Expected salary:")) {
				salary = lines[i + 1];
			}
			if (lines[i].equalsIgnoreCase("Locations:")) {
				location = lines[i + 1];
			}
		}
		Candidate c = new Candidate(name, pos, company, year, salary, location);
		return c;
	}

	public static void show() {
		int id = 1;
		System.out.printf("%-5s | %-25s | %-40s | %-50s | %-10s | %-10s | %-15s\n", "ID", "NAME", "POSITION", "COMPANY",
				"YEAR", "SALARY", "LOCATION");
		for (Candidate c : ds) {
			System.out.format("%-5s | ", id);
			System.out.format("%-25s | ", c.getName());
			System.out.format("%-40s | ", c.getPosition());
			System.out.format("%-50s | ", c.getCompany());
			System.out.format("%-10s | ", c.getYear());
			System.out.format("%-10s |", c.getSalary());
			System.out.format("%-15s |%n", c.getLocation());
			id++;
		}
	}

}
