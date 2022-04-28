package pu.fmi.cowbull;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GameController {

	@GetMapping("/")
	public String hello(String name) {
		return "Welcome";
	}

	@PostMapping("games")
	public String startNewGame() {

		return "Game";
	}
}
