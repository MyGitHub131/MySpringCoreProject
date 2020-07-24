package com.alliswell.beans;

import java.util.Map;
import java.util.Properties;

public class College {
	Map<String, Course> hodToCourseMap;
	Properties courseToppers;

	public void setHodToCourseMap(Map<String, Course> hodToCourseMap) {
		this.hodToCourseMap = hodToCourseMap;
	}

	public void setCourseToppers(Properties courseToppers) {
		this.courseToppers = courseToppers;
	}

	@Override
	public String toString() {
		return "College [hodToCourseMap=" + hodToCourseMap + ", courseToppers=" + courseToppers + "]";
	}

}
