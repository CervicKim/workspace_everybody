package com.dw.emp.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class EmpController {

	@GetMapping("/emp")
	public String callEmpPage() {
		return "emp";
	}
	
}
