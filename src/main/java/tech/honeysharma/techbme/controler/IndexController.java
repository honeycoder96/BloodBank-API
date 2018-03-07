package tech.honeysharma.techbme.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/documentation")
	public String documentation() {
		return "blog1";
	}

	@RequestMapping("/drugsdoc")
	public String drugs() {
		return "drugs";
	}

	@RequestMapping("/hospitals")
	public String hospitals() {
		return "hospitals";
	}

	@RequestMapping("/diseases")
	public String diseases() {
		return "diseases";
	}
}
