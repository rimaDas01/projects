package com.example.demochatcontroller;

//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SocialMediaController {
	@RequestMapping(value="/rima")
	public String hello() {
		return "Hi Rima";
	}
}
