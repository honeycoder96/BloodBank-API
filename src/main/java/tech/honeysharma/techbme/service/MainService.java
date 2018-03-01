package tech.honeysharma.techbme.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.honeysharma.techbme.modal.BloodBank;
import tech.honeysharma.techbme.repository.MainRepository;

@Service
public class MainService {

	@Autowired
	private MainRepository mainrepository;

	public List<BloodBank> getAllTopics() {

		List<BloodBank> bloodbanks = new ArrayList<>();
		mainrepository.findAll().forEach(bloodbanks::add);

		return bloodbanks;
	}

}
