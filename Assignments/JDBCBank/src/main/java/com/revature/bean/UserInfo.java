package com.revature.bean;

public class UserInfo extends User{
	
	private int user_ID;  
    private String user_Name;  
    private int user_Typ;
    private String firstName; 
    private String lastName;  
    private String addressln;  
    private String city;  
    private String state; 
    private String country;  
    private String zip;  
    private String contact_num;  
    private String Email;
    
    
    
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}



	public UserInfo(String username, String password) {
		super(username, password);
		// TODO Auto-generated constructor stub
	}



	public UserInfo(int user_ID, String user_Name, int user_Typ, String firstName, String lastName, String addressln,
			String city, String state, String country, String zip, String contact_num, String email) {
		super();
		this.user_ID = user_ID;
		this.user_Name = user_Name;
		this.user_Typ = user_Typ;
		this.firstName = firstName;
		this.lastName = lastName;
		this.addressln = addressln;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zip = zip;
		this.contact_num = contact_num;
		Email = email;
	}



	public int getUser_ID() {
		return user_ID;
	}



	public void setUser_ID(int user_ID) {
		this.user_ID = user_ID;
	}



	public String getUser_Name() {
		return user_Name;
	}



	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}



	public int getUser_Typ() {
		return user_Typ;
	}



	public void setUser_Typ(int user_Typ) {
		this.user_Typ = user_Typ;
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



	public String getAddressln() {
		return addressln;
	}



	public void setAddressln(String addressln) {
		this.addressln = addressln;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
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



	public String getZip() {
		return zip;
	}



	public void setZip(String zip) {
		this.zip = zip;
	}



	public String getContact_num() {
		return contact_num;
	}



	public void setContact_num(String contact_num) {
		this.contact_num = contact_num;
	}



	public String getEmail() {
		return Email;
	}



	public void setEmail(String email) {
		Email = email;
	}



	@Override
	public String toString() {
		return "UserInfo [user_ID=" + user_ID + ", user_Name=" + user_Name + ", user_Typ=" + user_Typ + ", firstName="
				+ firstName + ", lastName=" + lastName + ", addressln=" + addressln + ", city=" + city + ", state="
				+ state + ", country=" + country + ", zip=" + zip + ", contact_num=" + contact_num + ", Email=" + Email
				+ ", username=" + username + ", password=" + password + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((Email == null) ? 0 : Email.hashCode());
		result = prime * result + ((addressln == null) ? 0 : addressln.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((contact_num == null) ? 0 : contact_num.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + user_ID;
		result = prime * result + ((user_Name == null) ? 0 : user_Name.hashCode());
		result = prime * result + user_Typ;
		result = prime * result + ((zip == null) ? 0 : zip.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserInfo other = (UserInfo) obj;
		if (Email == null) {
			if (other.Email != null)
				return false;
		} else if (!Email.equals(other.Email))
			return false;
		if (addressln == null) {
			if (other.addressln != null)
				return false;
		} else if (!addressln.equals(other.addressln))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (contact_num == null) {
			if (other.contact_num != null)
				return false;
		} else if (!contact_num.equals(other.contact_num))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (user_ID != other.user_ID)
			return false;
		if (user_Name == null) {
			if (other.user_Name != null)
				return false;
		} else if (!user_Name.equals(other.user_Name))
			return false;
		if (user_Typ != other.user_Typ)
			return false;
		if (zip == null) {
			if (other.zip != null)
				return false;
		} else if (!zip.equals(other.zip))
			return false;
		return true;
	} 
	
	
    
    
    

}
