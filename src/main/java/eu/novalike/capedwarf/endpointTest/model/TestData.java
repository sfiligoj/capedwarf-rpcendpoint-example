package eu.novalike.capedwarf.endpointTest.model;

import java.util.Date;

public class TestData {
	private String stringData;
	private Double doubledata;
	private Long longData;
	private Float floatData;
	private Integer integerData;
	private Boolean booleanData;
	private Date dateData;

	public TestData() {
	}

	public TestData(String stringData, Double doubleData, Long longData,
			Float floatData, Integer integerData, Boolean booleanData,
			Date dateData) {
		this.stringData = stringData;
		this.doubledata = doubleData;
		this.longData = longData;
		this.floatData = floatData;
		this.integerData = integerData;
		this.booleanData = booleanData;
		this.dateData = dateData;
	}

	public String getStringData() {
		return stringData;
	}

	public void setStringData(String stringData) {
		this.stringData = stringData;
	}

	public Double getDoubledata() {
		return doubledata;
	}

	public void setDoubledata(Double doubledata) {
		this.doubledata = doubledata;
	}

	public Long getLongData() {
		return longData;
	}

	public void setLongData(Long longData) {
		this.longData = longData;
	}

	public Float getFloatData() {
		return floatData;
	}

	public void setFloatData(Float floatData) {
		this.floatData = floatData;
	}

	public Integer getIntegerData() {
		return integerData;
	}

	public void setIntegerData(Integer integerData) {
		this.integerData = integerData;
	}

	public Boolean getBooleanData() {
		return booleanData;
	}

	public void setBooleanData(Boolean booleanData) {
		this.booleanData = booleanData;
	}

	public Date getDateData() {
		return dateData;
	}

	public void setDateData(Date dateData) {
		this.dateData = dateData;
	}

}
