package com.spring.trex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main() {
	
		
		return "main";
	}
	
	@RequestMapping(value = "/board", method = RequestMethod.GET)
	public String boardmain() {
		return "board/boardmain";
	}
	
	@RequestMapping(value = "/abcd", method = RequestMethod.GET)
	public String abcdmain() {
		return "abcd/abcd";
	}


}
