package TEST;

public class Candidate {
	String name, position, company, year, salary, location;
	String job_level, gender, link;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Candidate(String name, String position, String company, String year, String salary, String location) {
		super();
		this.name = name;
		this.position = position;
		this.company = company;
		this.year = year;
		this.salary = salary;
		this.location = location;
	}

	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}
}
