package com.jilani.voter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jilani.voter.entity.voter;
import com.jilani.voter.service.voterService;

@RestController
@RequestMapping("/voter")
public class voterController {

	@Autowired
	private voterService vs;
	
	@PostMapping("/savevoter")
	public String saveUserDetails(@RequestBody voter vt) {
		String vtr=vs.saveVoter(vt);
		return vtr;
	}
}
