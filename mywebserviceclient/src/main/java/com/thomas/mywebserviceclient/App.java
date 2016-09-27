package com.thomas.mywebserviceclient;

import com.thomas.mywebserviceclient.DataExtracter.User;

public class App
{
	public final static void main(String[] args) {
		try {
		String jsonData = DataGetter.getJsonData();
		System.out.println("json = "+jsonData);
		User user = DataExtracter.getLocalWeatherDataFromJson(jsonData);
		System.out.println("user = "+user.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	
	public static void computeWeather(String city, String country){
		try {
			
//			DataExtracter.Data data = DataExtracter.getLocalWeatherDataFromXml(xmlData);
//			System.out.println("City : "+city);
//			System.out.println("current temperature (celsius) : "+data.current_condition.temp_C);
//			System.out.println("sky condition : "+data.current_condition.weatherDesc);
//			System.out.println("humidity : "+data.current_condition.humidity);
		} catch (Exception e) {
			System.out.println("Can't get "+city+","+country+" weather informations.");
			e.printStackTrace();
		}
		System.out.println("---------------");
	}
}

