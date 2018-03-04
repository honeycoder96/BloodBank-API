package tech.honeysharma.techbme.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.honeysharma.techbme.modal.Drugs;
import tech.honeysharma.techbme.repository.DrugsRepository;

@Service
public class DrugsService {

	@Autowired
	private DrugsRepository drugsrepository;

	// retrieve all the medicine
	public List<Drugs> getAllDrugs() {

		List<Drugs> drugs = new ArrayList<>();
		drugsrepository.findAll().forEach(drugs::add);
		return drugs;
	}

	// Retrive a specific drug
	public Optional<Drugs> getDrug(String id) {

		return drugsrepository.findById(id);
	}

}
