package com.example.demo;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class DemoApplication {
	
	
	@RequestMapping("/")
	public String home(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("name", "okok");
		System.out.println("home");
		return "home version 2";
	}
	
	
	@RequestMapping("/sess")
	public String home2(HttpServletRequest request) {
		System.out.println("sess : " + request.getSession().getAttribute("name") );
		System.out.println("sess2 : " + request.getAttribute("name") );
		return "home";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
 