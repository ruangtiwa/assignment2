package com.ait.sad.controller;

import java.sql.Connection;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ait.sad.DbManager;
import com.ait.sad.model.Memo;
import com.ait.sad.model.MemoBuilder;
import com.ait.sad.model.MemoFactory;
import com.ait.sad.model.MemoMap;
import com.ait.sad.repository.MemoRepository;
import com.ait.sad.model.Weather;
import com.ait.sad.controller.FacadeController;

@Controller
public class MainController {

	MemoRepository memoRepository;

	@RequestMapping("/")
	public String index(Model model) {
		memoRepository = new MemoRepository();
		Weather weather = new Weather(); 

		// Memo memo = memoRepository.findOneById(1);
		ArrayList<Memo> list = memoRepository.findAll();
		model.addAttribute("memos", list);
		// Weather
		ArrayList<Weather> listWeather = weather.findAll();
		model.addAttribute("weather", listWeather);
		// this is jsp file name
		return "index";
	}

	@RequestMapping("/form")
	public String formPage(Model model) {
		model.addAttribute("memo", new MemoMap());
		return "form";
	}

	@RequestMapping(value = "/addMemo", method = RequestMethod.POST)
	public String submitMemo(@Valid @ModelAttribute("memo") MemoMap memoMap, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			return "error";
		}

		memoRepository = new MemoRepository();
		memoRepository.save(new MemoFactory().makeMemo(memoMap));
		ArrayList<Memo> list = memoRepository.findAll();
		model.addAttribute("memos", list);
		return "redirect:" + "/";
	}
	
	

	////////////////////////////////////////////////////////

	// ********** END OF WORKING CODE

	////////////////////////////////////////////////////////


	private boolean checkConnectDb() {
		String strDb;
		DbManager db = new DbManager();
		Connection conn = db.getConnection();
		if (conn == null) {
			strDb = "no connection";
			System.out.println(strDb);
			db.close();
			return false;
		} else {
			strDb = "connection successful";
			System.out.println(strDb);
			db.close();
			return true;
		}

	}
}