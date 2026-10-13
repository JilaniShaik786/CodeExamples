package com.jilani.voter.entity;

import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class voter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer voterid;
	String votername;
	LocalDate voterdob;
	Integer voterage;
	
	public voter() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public voter(Integer voterid, String votername, LocalDate voterdob, Integer voterage) {
		super();
		this.voterid = voterid;
		this.votername = votername;
		this.voterdob = voterdob;
		this.voterage = voterage;
	}


	public Integer getVoterage() {
		return voterage;
	}


	public void setVoterage(Integer voterage) {
		this.voterage = voterage;
	}


	public Integer getVoterid() {
		return voterid;
	}
	public void setVoterid(Integer voterid) {
		this.voterid = voterid;
	}
	public String getVotername() {
		return votername;
	}
	public void setVotername(String votername) {
		this.votername = votername;
	}
	public LocalDate getVoterdob() {
		return voterdob;
	}
	public void setVoterdob(LocalDate voterdob) {
		this.voterdob = voterdob;
	}
	@Override
	public String toString() {
		return "voter [voterid=" + voterid + ", votername=" + votername + ", voterdob=" + voterdob + "]";
	}
	
	
	
	

}
