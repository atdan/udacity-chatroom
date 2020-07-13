package com.example.udacitychatroom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class UdacityChatroomApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdacityChatroomApplication.class, args);
	}

	/**
	 * Login Page
	 */
	@GetMapping("/")
	public ModelAndView login() {
		return new ModelAndView("/login");
	}

	/**
	 * Chatroom Page
	 */
	@GetMapping("/index")
	public ModelAndView index(String username, HttpServletRequest request) throws UnknownHostException {
		//TODO: add code for login to chatroom.
		ModelAndView mv = new ModelAndView("/chat");
		if(username == null || username == ""){
			username = "NotAnUser";
		}

		mv.addObject("username", username);
		// TODO: To return Route = "ws://localhost:8080/chat"
		mv.addObject("url","ws://" + InetAddress.getLocalHost().getHostName() + ":" +request.getServerPort()+request.getContextPath() + "/chat");
		return mv;
	}
}
