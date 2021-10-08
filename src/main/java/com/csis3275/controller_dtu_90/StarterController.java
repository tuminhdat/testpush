package com.csis3275.controller_dtu_90;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	
public class StarterController {
	@RequestMapping("/")
	public String firstPage() {
		return "starter";
	}
}
