package com.alliswell.beans;

import java.util.List;
import java.util.Set;

public class Rocket {
	private List<String> rockets;
	private Set<String> scientist;

	public void setRockets(List<String> rockets) {
		this.rockets = rockets;
	}

	public void setScientist(Set<String> scientist) {
		this.scientist = scientist;
	}

	@Override
	public String toString() {
		return "Rocket [rockets=" + rockets + ", scientist=" + scientist + "]";
	}

}
