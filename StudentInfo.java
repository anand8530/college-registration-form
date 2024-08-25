package Project;

public class StudentInfo {

	private int Srno;
	private String Firstname;
	private String Lastname;
	private String city;
	private String Emailid;
	private String Contactno;
	private double percentageoflastyear;
	private String Stream;
	private int Age;
	public int getSrno() {
		return Srno;
	}
	public void setSrno(int srno) {
		Srno = srno;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getContactno() {
		return Contactno;
	}
	public void setContactno(String contactno) {
		Contactno = contactno;
	}
	public double getPercentageoflastyear() {
		return percentageoflastyear;
	}
	public void setPercentageoflastyear(double percentageoflastyear) {
		this.percentageoflastyear = percentageoflastyear;
	}
	public String getStream() {
		return Stream;
	}
	public void setStream(String stream) {
		Stream = stream;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getEmailid() {
		return Emailid;
	}
	public void setEmailid(String emailid) {
		Emailid = emailid;
	}
	
	
	
	@Override
	public String toString() {
		return "StudentInfo [Srno=" + Srno + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", city=" + city
				+ ", Emailid=" + Emailid + ", Contactno=" + Contactno + ", percentageoflastyear=" + percentageoflastyear
				+ ", Stream=" + Stream + ", Age=" + Age + "]";
	}
	
	
	
	
}
