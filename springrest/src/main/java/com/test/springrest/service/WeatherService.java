/**
 * 
 */
package com.test.springrest.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.test.springrest.common.Constants;
import com.test.springrest.dto.WeatherData;

@Service
public class WeatherService {

	public String retrieveWeatherInfo() {
		RestTemplate restTemplate = new RestTemplate();
		WeatherData data = restTemplate.getForObject(Constants.URI, WeatherData.class);
		long count = data.getList().stream().filter(str -> str.getName().startsWith(Constants.STARTING_CHAR)).count();
		return new StringBuilder(Constants.RESULT_STRING).append(count).toString();
	}
}
