package tech.honeysharma.techbme.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.honeysharma.techbme.modal.BloodBank;
import tech.honeysharma.techbme.service.MainService;

@RestController
public class MainController {

	@Autowired
	private MainService mainservice;

	@RequestMapping("/bloodbank")
	public List<BloodBank> getAllTopics() {

		return mainservice.getAllTopics();
	}
}
