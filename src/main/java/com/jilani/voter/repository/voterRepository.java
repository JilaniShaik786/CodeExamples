package com.jilani.voter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jilani.voter.entity.voter;

@Repository
public interface voterRepository extends JpaRepository<voter, Integer> {

}
