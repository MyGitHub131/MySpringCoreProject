package com.alliswell.beans;

import java.util.Map;
import java.util.Properties;

public class LunchPaid {
	private Map<String, Rocket> chiefOfScientist;
	private Properties mostPopulerRocketScientist;

	public void setChiefOfScientist(Map<String, Rocket> chiefOfScientist) {
		this.chiefOfScientist = chiefOfScientist;
	}

	public void setMostPopulerRocketScientist(Properties mostPopulerRocketScientist) {
		this.mostPopulerRocketScientist = mostPopulerRocketScientist;
	}

	@Override
	public String toString() {
		return "LunchPaid [chiefOfScientist=" + chiefOfScientist + ", mostPopulerRocketScientist="
				+ mostPopulerRocketScientist + "]";
	}

}
