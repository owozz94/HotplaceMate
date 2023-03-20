package com.mycompany.hotple.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController {
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String Dashboard(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("center", "mainPage.jsp");
		return "dashBoard";
	}
}
