import VNWORK.Information;
import VNWORK.List_Recruiter;
import VNWORK.Working;

public class Main {
	public static void main(String[] args) throws Exception {
		Working work= new Working();
		String find_url="https://employer.vietnamworks.com/v2/login";
		List_Recruiter.Read();
		Information.change(find_url);
		work.Navigate();
		work.Do();
		//work.Close();
	}
}
