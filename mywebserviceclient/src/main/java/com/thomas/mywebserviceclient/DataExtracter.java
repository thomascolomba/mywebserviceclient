package com.thomas.mywebserviceclient;


import com.fasterxml.jackson.databind.ObjectMapper;

public class DataExtracter {
	private static ObjectMapper mapper = new ObjectMapper();
	public static User getLocalWeatherDataFromJson(String json) throws Exception {
		return mapper.readValue(json, User.class);
	}
	
	///////////////////////////////////////////////////////////////////
	// Here is some classes I got from WorldWeatherOnline examples.
	///////////////////////////////////////////////////////////////////
//	@XmlRootElement(namespace = "com.example.javawwo.LocalWeather.Data")
//	@XmlAccessorType( XmlAccessType.FIELD )
	static class User {
	    String firstname;
	    String lastname;
	    Integer age;
	    User() {}
	    
	    @Override
	    public String toString() {
	    	return ""+firstname+" "+lastname+" "+age;
	    }
	    
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
	    
	}
}
