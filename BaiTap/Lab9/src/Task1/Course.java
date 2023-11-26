package Task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Course {
	String id,tittle,type;
	List<Student> students;
	String lecturer;
	public Course(String id, String tittle, String type, List<Student> students, String lecturer) {
		super();
		this.id = id;
		this.tittle = tittle;
		this.type = type;
		this.students = students;
		this.lecturer = lecturer;
	}
	public void add(Student s) {
		students.add(s);
	}
	public boolean hasMoreStudentThan(Course course) {

		if(this.students.size() > course.students.size()) {
			return true;
		}
		return false;
	}
	 public Map<Integer, List<Student>> groupStudentsByYear(){
		HashMap<Integer,List<Student>> map = new HashMap<Integer, List<Student>>();
		Student st = students.get(0);
		for (int i =1; i< students.size();i++ ) {
			int year = st.year;
			if(map.containsKey(year)) {
				map.put(year,new ArrayList<>());
			}
			map.get(year).add(st);
		}
		return map;
		
	 }
 }
