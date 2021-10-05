package com.kiran.background;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/hello")
	public String myMethod() {
		return "Hi welcome Kiran to git rebase";
	}

}
