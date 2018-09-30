package com.plantplaces;

import org.springframework.stereotype.Controller;
// couldnt get the web annotation to import

@Controller
public class PlantPlacesController {
	
	/**
	 * Handle the /start endpoint.
	 * @return
	 */
	@RequestMapping("/start")
	public string start() {
		return "start";
	}
	/**
	 * Handle the / endpoint
	 * @return
	 */
	@RequestMapping("/")
	public string index() {
		return "start";
	}
}
