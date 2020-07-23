package com.alliswell.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Robot {
	@Autowired
	@Qualifier("chip2")
	private Chip chip = null;

	/*public void setChip(Chip chip) {
		this.chip = chip;
	}*/

	@Override
	public String toString() {
		return "Robot [chip=" + chip + "]";
	}

}
