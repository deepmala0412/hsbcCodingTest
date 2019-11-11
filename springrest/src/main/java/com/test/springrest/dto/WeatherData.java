/**
 * 
 */
package com.test.springrest.dto;

import java.io.Serializable;
import java.util.List;

public class WeatherData implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer cod;
	
	private float calctime;
	
	private int cnt;
	
	private List<WeatherDetail> list;

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public float getCalctime() {
		return calctime;
	}

	public void setCalctime(float calctime) {
		this.calctime = calctime;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public List<WeatherDetail> getList() {
		return list;
	}

	public void setList(List<WeatherDetail> detailList) {
		this.list = detailList;
	}
	

}
