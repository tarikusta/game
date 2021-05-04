package game;

public class Gamers {
	private String nationalId ;
	private String firstName;
	private String lastName;
	private String birthday;
	


	public Gamers() {
		
	}



	public Gamers(String nationalId, String firstName, String lastName, String birthday) {
		super();
		this.nationalId = nationalId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
	}



	public String getNationalId() {
		return nationalId;
	}



	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getBirthday() {
		return birthday;
	}



	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
}
