/**
 * 
 */
package com.test.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.springrest.exception.CustomException;
import com.test.springrest.service.WeatherService;

/**
 * @author Deep
 *
 */

@RestController
public class WeatherController {

	@Autowired
	private WeatherService weatherService;

	@GetMapping("/weatherinfo")
	public String retriveWeatherData() throws CustomException {
		String result = null;
		try {
			result = weatherService.retrieveWeatherInfo();
		} catch (Exception e) {
			throw new CustomException(e.getLocalizedMessage());
		}
		return result;
	}

//	
}
