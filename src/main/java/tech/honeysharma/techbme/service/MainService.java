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

		/*
		 * List<BloodBank> bank = new ArrayList<BloodBank>();
		 * 
		 * bank.add(new BloodBank("2", "I.N.H.S. Dhanvantri",
		 * "Andaman And Nicobar Islands", "SOUTH ANDAMAN", "Port Blair",
		 * "Ashvini Nagar, Port Blair, Andaman and Nicobar Islands.", "744103",
		 * "03192 248759", "8001452200", "N/A", "data missing", "data missing",
		 * "Dr.Smiriti Mathur", "03192 248759", "8001452200", "mesmriti@yahoo.com",
		 * "Government", "11.649693", "92.717418"));
		 * 
		 * bank.add(new BloodBank("3", "Pillar Health Centre Blood Bank",
		 * "Andaman And Nicobar Islands", "SOUTH ANDAMAN", "Port Blair",
		 * "Lamba Line,P.B. 526,P.O. Junglighat, Opposite Airport", "744104",
		 * "03192 233193, 03192 233993", "9474247585", "03192 233193",
		 * "pillarbloodbank2016@gmail.com", "website", "Dr. Sr. Cross Mary",
		 * "03192 233193, 03192 233993", "9474247585", "crossgracy2003@yahoo.co.in",
		 * "Charity", "11.653229", "92.730714"));
		 * 
		 * return bank;
		 */

		return bloodbanks;
	}

}
