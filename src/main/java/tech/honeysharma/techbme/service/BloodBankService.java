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

	public void addTopic(BloodBank bloodbank) {

		bloodbankrepository.save(bloodbank);

	}

	public void updateTopic(String id, BloodBank bloodbank) {

		bloodbankrepository.save(bloodbank);
	}

	public void deleteTopic(String id) {

		bloodbankrepository.deleteById(id);
	}

	public List<BloodBank> getBloodBankByCategory(String category) {

		return bloodbankrepository.findBycategory(category);
	}

	public List<BloodBank> getBloodBankByCity(String city) {

		return bloodbankrepository.findBycity(city);
	}

	public List<BloodBank> getBloodBankByDistrict(String district) {

		return bloodbankrepository.findBydistrict(district);
	}

	public List<BloodBank> getBloodBankByPincode(String pincode) {

		return bloodbankrepository.findBypincode(pincode);
	}

	public List<BloodBank> getBloodBankByState(String state) {

		return bloodbankrepository.findBystate(state);
	}

}
