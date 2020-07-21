package com.cdi.beans;

import java.util.Map;
import java.util.Properties;

public class College {

	private Map<String, Course> hodToCourseMap;
	private Properties courseToppers;

	public void setHodToCourseMap(Map<String, Course> hodToCourseMap) {
		this.hodToCourseMap = hodToCourseMap;
	}

	public void setCourseToppers(Properties courseToppers) {
		this.courseToppers = courseToppers;
	}

	@Override
	public String toString() {
		return "College [hodToCourseMap=" + hodToCourseMap + ", courseToppers="
				+ courseToppers + "]";
	}

}
