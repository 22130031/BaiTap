package Task1;

public class Student {
	String id, name;
	int year;
	public boolean sameYear(Student student) {
		if(this.year == student.year)
			return true;
		return false;
	}
}
