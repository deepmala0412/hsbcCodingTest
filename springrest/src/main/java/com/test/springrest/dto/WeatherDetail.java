package com.test.springrest.dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class WeatherDetail {

	private Integer id;

	private String name;

	private Coordinates coord;

	private MainInfo main;

	private BigDecimal dt;

	private WindInfo wind;

	private Map<String, BigDecimal> rain;

	private List<WeatherInfo> weather;

	private Map<String, BigDecimal> clouds;

	public Integer getId() {
		return id;
	}

	public Map<String, BigDecimal> getRain() {
		return rain;
	}

	public void setRain(Map<String, BigDecimal> rain) {
		this.rain = rain;
	}

	public Map<String, BigDecimal> getClouds() {
		return clouds;
	}

	public void setClouds(Map<String, BigDecimal> clouds) {
		this.clouds = clouds;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Coordinates getCoord() {
		return coord;
	}

	public void setCoord(Coordinates coord) {
		this.coord = coord;
	}

	public MainInfo getMain() {
		return main;
	}

	public void setMain(MainInfo main) {
		this.main = main;
	}

	public BigDecimal getDt() {
		return dt;
	}

	public void setDt(BigDecimal dt) {
		this.dt = dt;
	}

	public WindInfo getWind() {
		return wind;
	}

	public void setWind(WindInfo wind) {
		this.wind = wind;
	}

	public List<WeatherInfo> getWeather() {
		return weather;
	}

	public void setWeather(List<WeatherInfo> weather) {
		this.weather = weather;
	}

}
