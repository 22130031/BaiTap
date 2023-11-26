package Task1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Faculty {
	String name, address;
	List<Course> courses;

	public Faculty(String name, String address, List<Course> courses) {
		super();
		this.name = name;
		this.address = address;
		this.courses = courses;
	}

	public Course getMaxPracticalCourse() {
		Course re = courses.get(0);
		if(re.type.equals("TH"))
		for(int i =1;i< courses.size(); i++) {
			if(!re.hasMoreStudentThan(courses.get(i))) {
				re = courses.get(i);
			}
		}
		return re;

	}
	public Set<Course> filterCourses(String type) {
		return null;

	}
}
