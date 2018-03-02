package tech.honeysharma.techbme.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	public Optional<BloodBank> getBloodBank(@PathVariable("var") String id) {

		return bloodbankservice.getBloodBank(id);
	}

	@RequestMapping("/bloodbank/category/{var}")
	public List<BloodBank> getBloodBankByCategory(@PathVariable("var") String category) {

		return bloodbankservice.getBloodBankByCategory(category);
	}

	@RequestMapping("/bloodbank/city/{var}")
	public List<BloodBank> getBloodBankByCity(@PathVariable("var") String city) {

		return bloodbankservice.getBloodBankByCity(city);
	}

	@RequestMapping("/bloodbank/district/{var}")
	public List<BloodBank> getBloodBankByDistrict(@PathVariable("var") String district) {

		return bloodbankservice.getBloodBankByDistrict(district);
	}

	@RequestMapping("/bloodbank/pincode/{var}")
	public List<BloodBank> getBloodBankByPincode(@PathVariable("var") String pincode) {

		return bloodbankservice.getBloodBankByPincode(pincode);
	}

	@RequestMapping("/bloodbank/state/{var}")
	public List<BloodBank> getBloodBankByState(@PathVariable("var") String state) {

		return bloodbankservice.getBloodBankByState(state);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/admin/add")
	public void addTopic(@RequestBody BloodBank bloodbank) {
		bloodbankservice.addTopic(bloodbank);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/admin/update/{id}")
	public void updateTopic(@RequestBody BloodBank bloodbank, @PathVariable String id) {
		bloodbankservice.updateTopic(id, bloodbank);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/admin/delete/{id}")
	public void deleteTopic(@PathVariable String id) {
		bloodbankservice.deleteTopic(id);
	}
}
