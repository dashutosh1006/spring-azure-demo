package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyControllerClass {
	
	String str=null;
	
	@GetMapping("/getEmp")
	public String getEmployee() {
		if(str!=null) {
			str="Demo";
		}
		return "Ashutosh | 26 | Java Developer";
	}

}
