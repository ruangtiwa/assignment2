package com.ait.sad.controller;

import java.util.ArrayList;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ait.sad.model.Weather;

public class FacadeController {
	
	Weather weather;
	
	@RequestMapping("/weather")
	public ArrayList<Weather> listWeather(Model model) {

		// Memo memo = memoRepository.findOneById(1);
		ArrayList<Weather> list = weather.findAll();
		model.addAttribute("weather", list);
		// this is jsp file name
		return list;
	}
}
