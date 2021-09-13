package VNWORK;

import org.openqa.selenium.WebDriver;

public class Information {
	static WebDriver driver=null;
	static String VNword_url = "https://employer.vietnamworks.com/v2/login";
	static String username="recruitment@logigear.com";
	static String pass="stemsearching";
	static String account;
	static String password;
	static String url;
	
	public static void change(String find_url) {
		List_Recruiter.Read();
			if(List_Recruiter.find(find_url)!=null) {
				url= List_Recruiter.find(find_url).getUrl();
				account= List_Recruiter.find(find_url).getAcc();
				password= List_Recruiter.find(find_url).getPw();
				System.out.println("find: "+url);
				System.out.println("find: "+account);
				System.out.println("find: "+password);
				
			}else {
				System.out.println("Recruiter doesn't exits");
			}
	}
	
	
}
