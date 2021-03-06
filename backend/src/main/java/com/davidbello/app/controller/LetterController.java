package com.davidbello.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.davidbello.app.repository.LetterRepository;
import com.davidbello.app.model.Letter;;

/**
 * 
 * @author David Bello
 *
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class LetterController {

	@Autowired
	private LetterRepository letterRepository;
	
	@CrossOrigin(origins = "*")
	@GetMapping("/letter/{languajeId}")
	public List<Letter> getAllLettersByLanguajeId(@PathVariable(value = "languajeId") Long languajeId) {
		return letterRepository.findByLanguajeId(languajeId);
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/letter")
	public List<Letter> getAllLetters() {
		return letterRepository.findAll();
	}
}
