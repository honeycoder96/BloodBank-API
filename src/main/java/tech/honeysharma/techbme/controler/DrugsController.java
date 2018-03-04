package tech.honeysharma.techbme.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.honeysharma.techbme.modal.Drugs;
import tech.honeysharma.techbme.service.DrugsService;

@RestController
public class DrugsController {

	@Autowired
	private DrugsService drugsservice;

	@RequestMapping("/drugs")
	private List<Drugs> getAll() {
		return drugsservice.getAllDrugs();
	}

	@RequestMapping("/drugs/{var}")
	private Optional<Drugs> getOne(@PathVariable("var") String id) {

		return drugsservice.getDrug(id);
	}
}
