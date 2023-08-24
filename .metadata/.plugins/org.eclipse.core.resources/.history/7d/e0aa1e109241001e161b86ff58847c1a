package com.eazybytes.school.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eazybytes.school.model.Holiday;

@Controller
public class HolidayController {
	@GetMapping("/holidays")
	public String displayHoliday(Model model,@RequestParam(required = false) boolean festival,@RequestParam(required = false) boolean federal) {
		System.err.println("/holidays");
		model.addAttribute("festival",festival);
		model.addAttribute("federal",federal);
		//tạo các ngày lễ
		List<Holiday> holidays = Arrays.asList(new Holiday("Jan 1", "New Year's Day", Holiday.Type.FESTIVAL),
				new Holiday("Oct 31", "Halloween", Holiday.Type.FESTIVAL),
				new Holiday("Nov 24", "Thanksgiving Day", Holiday.Type.FESTIVAL),
				new Holiday("Dec 25", "Chrismas", Holiday.Type.FESTIVAL),
				new Holiday("Jan 17", "Martin Luther King Jr. Day", Holiday.Type.FEDERAL),
				new Holiday("July 4", "Independence Day", Holiday.Type.FEDERAL),
				new Holiday("Step 5", "Labor Day", Holiday.Type.FEDERAL),
				new Holiday("Nov 11", "Veterans Day", Holiday.Type.FEDERAL));
		Holiday.Type[] types = Holiday.Type.values();
		for (Holiday.Type type : types) {
//			model.addAttribute(attributeName, attributeValue)
			model.addAttribute(type.toString(),(holidays.stream().filter(holiday->holiday.getType().equals(type)).collect(Collectors.toList())));
			System.out.println(type.toString());
//			System.out.println((holidays.stream().filter(holiday->holiday.getType().equals(type)).collect(Collectors.toList())));
			
		}
		return "holidays.html";
	}

}
