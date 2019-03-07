package com.ait.sad.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ait.sad.DbManager;

public class Weather {
	private String weather_detail;

	private String weather_name;

	public String getWeather_detail() {
		return weather_detail;
	}

	public void setWeather_detail(String weather_detail) {
		this.weather_detail = weather_detail;
	}

	public String getWeather_name() {
		return weather_name;
	}

	public void setWeather_name(String weather_name) {
		this.weather_name = weather_name;
	}
	
	public ArrayList<Weather> findAll() {
		PreparedStatement ps = null;
		ResultSet rs = null;

		DbManager db = new DbManager();
		Connection conn = db.getConnection();

		ArrayList<Weather> weatherList = new ArrayList<Weather>();

		try {
			ps = conn.prepareStatement("select name, detail from weather");

			rs = ps.executeQuery();

			System.out.println("111111111111");
			while (rs.next()) {

				Weather weather = new Weather();

				weather.setWeather_name(rs.getString("name"));
				weather.setWeather_detail(rs.getString("detail"));
				
				
				weatherList.add(weather);

			}
			System.out.println("2222222222");

			conn.close();
			return weatherList;

		} catch (

		SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.close();
		}
		return null;
	}

}
