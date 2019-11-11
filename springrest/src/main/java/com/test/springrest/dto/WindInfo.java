package com.test.springrest.dto;

import java.math.BigDecimal;

public class WindInfo {
	
	private BigDecimal speed;
	
	private BigDecimal deg;

	public BigDecimal getSpeed() {
		return speed;
	}

	public void setSpeed(BigDecimal speed) {
		this.speed = speed;
	}

	public BigDecimal getDeg() {
		return deg;
	}

	public void setDeg(BigDecimal deg) {
		this.deg = deg;
	}

}
