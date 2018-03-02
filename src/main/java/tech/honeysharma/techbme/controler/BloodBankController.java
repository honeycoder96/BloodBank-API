package tech.honeysharma.techbme.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.honeysharma.techbme.modal.BloodBank;
import tech.honeysharma.techbme.service.BloodBankService;

@RestController
public class BloodBankController {

	@Autowired
	private BloodBankService bloodbankservice;

	@RequestMapping("/bloodbank")
	public List<BloodBank> getAllTopics() {

		return bloodbankservice.getAllTopics();
	}

	@RequestMapping("/bloodbank/{var}")
	public Optional<BloodBank> getTopic(@PathVariable("var") String id) {

		return bloodbankservice.getBloodBank(id);
	}
}
