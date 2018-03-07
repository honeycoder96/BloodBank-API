package tech.honeysharma.techbme.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("//documentation")
	public String documentation() {
		return "blog1";
	}
}
