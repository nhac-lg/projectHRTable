package VNWORK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Working {
	
	public Working() {
		WebDriverManager.chromedriver().setup();
		Information.driver = new ChromeDriver();
	}

	public void Navigate() {
		String title="VietnamWorks - Top employment and recruitment website in Vietnam.";
		Information.driver.manage().window().maximize();
		Information.driver.get(Information.url);
		if(Information.driver.getTitle().equals(title)) {
			System.out.println("page VietNamWork exits");
		}else {
			System.out.println("page VietNamWork doesn't exits");
		}
	}

	public void Do() throws Exception {
		//step 1: check login or not
		if (Login.existsElement("btnLogin")) {
			Login.login(Information.username, Information.pass);
			System.out.println("login successful");
		}
		
		if(Search.existsElement("//header/nav[1]/div[1]/div[1]/a[2]/span[1]")) {
			System.out.println("logged in");
			Search.clicksearch();
		}
		//step 2: search filter
		Search.set_categori("IT - Software");
		Thread.sleep(4000);
		
		//step 3: extract 100 data 
		List_Capture_Candidate.all_print(60);
		List_Capture_Candidate.show();
		
	}
	
	public void Close() {
		Information.driver.close();
	}

}
