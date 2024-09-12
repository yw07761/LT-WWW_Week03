package entity;


public class Student {
	public String fName;
	public String lName;
	public String birthday;
	public String email;
	public int mobileNumber;
	public String gender;
	public String address;
	public String city;
	public String pinCode;
	public String state;
	public String country;
	public String hobbies;
	public String course;
	
	
	public Student() {
		super();
	}

	
	public Student(String fName, String lName, String birthday, String email, String gender) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.birthday = birthday;
		this.email = email;
		this.gender = gender;
	}


	public Student(String fName, String lName, String birthday, String email, int mobileNumber, String gender,
			String address, String city, String pinCode, String state, String country, String hobbies, String course) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.birthday = birthday;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
		this.address = address;
		this.city = city;
		this.pinCode = pinCode;
		this.state = state;
		this.country = country;
		this.hobbies = hobbies;
		this.course = course;
	}
	
	

	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public String getBirthday() {
		return birthday;
	}


	public void setBirthday(String birthdate) {
		this.birthday = birthdate;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getPinCode() {
		return pinCode;
	}


	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getHobbies() {
		return hobbies;
	}


	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	@Override
	public String toString() {
		return "Student [fName=" + fName + ", lName=" + lName + ", birthday=" + birthday + ", email=" + email
				+ ", mobileNumber=" + mobileNumber + ", gender=" + gender + ", address=" + address + ", city=" + city
				+ ", pinCode=" + pinCode + ", state=" + state + ", country=" + country + ", hobbies=" + hobbies
				+ ", course=" + course + "]";
	}


	


	
	
}
