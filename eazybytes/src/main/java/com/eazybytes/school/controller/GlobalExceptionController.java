package com.eazybytes.school.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
@ControllerAdvice
public class GlobalExceptionController {
	private static Logger log = LoggerFactory.getLogger(LoginController.class);
	/**
	 * @ExceptionHandler will register the given method for a given 
	 * exception type, so that ControllerAdvice can invoke this method 
	 * logic if a given exception type is throw inside the web application
	 * */
	@ExceptionHandler(Exception.class)
	public ModelAndView exceptionHandler(Exception exception) {
		//thiết lập chế độ xem cho người dùng
		ModelAndView errorPage = new ModelAndView();
		errorPage.setViewName("error");
		errorPage.addObject("errormsg",exception.getMessage());
		return errorPage;
	}
}
