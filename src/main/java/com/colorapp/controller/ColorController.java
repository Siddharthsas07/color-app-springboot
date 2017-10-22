package com.colorapp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.colorapp.model.Colors;

@RestController
@RequestMapping(value="/api/colors")
public class ColorController {
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET)
	public Colors getAllStudents(){
		return new Colors();
	}
}
