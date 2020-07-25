package com.alliswell.beans;

import java.util.Map;
import java.util.Properties;

public class Car {
	private Map<String, Engine> headOfEnginners;
	private Properties mostPopulerEngineers;

	public void setHeadOfEnginners(Map<String, Engine> headOfEnginners) {
		this.headOfEnginners = headOfEnginners;
	}

	public void setMostPopulerEngineers(Properties mostPopulerEngineers) {
		this.mostPopulerEngineers = mostPopulerEngineers;
	}

	@Override
	public String toString() {
		return "Car [headOfEnginners=" + headOfEnginners + ", mostPopulerEngineers=" + mostPopulerEngineers + "]";
	}

}
