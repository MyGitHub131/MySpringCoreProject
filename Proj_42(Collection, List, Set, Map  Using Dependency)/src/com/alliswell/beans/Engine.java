package com.alliswell.beans;

import java.util.List;
import java.util.Set;

public class Engine {
	private List<String> listOfEngines;
	private Set<String> Enginners;

	public void setListOfEngines(List<String> listOfEngines) {
		this.listOfEngines = listOfEngines;
	}

	public void setEnginners(Set<String> enginners) {
		Enginners = enginners;
	}

	@Override
	public String toString() {
		return "Engine [listOfEngines=" + listOfEngines + ", Enginners=" + Enginners + "]";
	}

}
