package com.itccloud.mwccdc.controller;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.io.FileReader;
import java.io.IOException;
import java.util.*;

@Controller
public class HomeController {
	@GetMapping("/")
	public String personsTable(Model model) throws IOException {
		
		List<Person> personList = new ArrayList<>();
		
		String filePath = "F:\\MSU\\ITC 475\\Assignment 3\\persons2.csv";
		FileReader reader = new FileReader(filePath);
		
		CSVParser parser = CSVParser.parse(reader, CSVFormat.DEFAULT.withIgnoreSurroundingSpaces());
		for(CSVRecord record: parser) {
			Person person = new Person(record.get(0), record.get(1), record.get(2), record.get(3));
			System.out.println(person);
			personList.add(person);
		}
		model.addAttribute("persons", personList);
		return "index-form";
	}
	
	@GetMapping("/home")
	public String home(Model model) {
		return "home-form";
	}
	
	@GetMapping("/business1")
	public String business1(Model model) {
		return "business1-form";
	}
	
	@GetMapping("/bootstrap-home")
	public String bootstrapHome(Model model) {
		return "bootstrap-home-form";
	}
	
	@GetMapping("/bootstrap-feature1")
	public String bootstrapFeature1(Model model) {
		return "bootstrap-feature1-form";
	}
} 