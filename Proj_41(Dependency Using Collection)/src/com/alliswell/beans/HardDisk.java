package com.alliswell.beans;

import java.util.List;
import java.util.Set;

public class HardDisk {
	private List<String> hardDiskChips;
	private Set<String> company;

	public void setHardDiskChips(List<String> hardDiskChips) {
		this.hardDiskChips = hardDiskChips;
	}

	public void setCompany(Set<String> company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "HardDisk [hardDiskChips=" + hardDiskChips + ", company=" + company + "]";
	}

}
