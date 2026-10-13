package com.jilani.voter.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jilani.voter.entity.voter;
import com.jilani.voter.repository.voterRepository;

@Service
public class voterService {

	@Autowired
	private voterRepository vr;

	public String saveVoter(voter vt) {

		LocalDate dob = vt.getVoterdob();
		System.out.println("voter dob = " + dob);

		LocalDate today = LocalDate.now();
		int age = Period.between(dob, today).getYears();
		System.out.println("voter age = " + age);
		vt.setVoterage(age);
		if (age > 18) {
			vr.save(vt);
			return "Successfully Voter Details are Added";
		} else {
			return "User is not eligible to get the votercard";
		}

	}

	public voter getVoter(Integer voterId) {
		// TODO Auto-generated method stub
		
		return vr.findById(voterId).get();
	}
	
	

}
	

