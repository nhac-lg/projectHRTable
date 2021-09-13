package VNWORK;

public class Recruiter {
	String url, acc, pw;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAcc() {
		return acc;
	}

	public void setAcc(String acc) {
		this.acc = acc;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public Recruiter(String url, String acc, String pw) {
		super();
		this.url = url;
		this.acc = acc;
		this.pw = pw;
	}

	public Recruiter() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Recruiter [url=" + url + ", acc=" + acc + ", pw=" + pw + "]";
	}
	
}
