package com.tcs.service;

/**
 * @author springuser19
 *
 */



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.tcs.entity.Professor;

import com.tcs.repository.ProfessorRepository;



@Service
public class ProfessorService {
	@Autowired
	ProfessorRepository<Professor> professorRepository;
	@Transactional
	public boolean addProfessor(Professor professor) {
		return professorRepository.save(professor) != null;	
		}

}

