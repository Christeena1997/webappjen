package com.webappjen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/all")
public class WebappJen {
	@GetMapping(value="/ok")
public String getno() {
	return "all are fine";
}
}
