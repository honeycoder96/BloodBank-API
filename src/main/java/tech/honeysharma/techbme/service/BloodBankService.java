package tech.honeysharma.techbme.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.honeysharma.techbme.modal.BloodBank;
import tech.honeysharma.techbme.repository.BloodBankRepository;

@Service
public class BloodBankService {

	@Autowired
	private BloodBankRepository bloodbankrepository;

	public List<BloodBank> getAllTopics() {

		List<BloodBank> bloodbanks = new ArrayList<>();
		bloodbankrepository.findAll().forEach(bloodbanks::add);
		return bloodbanks;
	}

	public Optional<BloodBank> getBloodBank(String id) {

		return bloodbankrepository.findById(id);
	}

}
