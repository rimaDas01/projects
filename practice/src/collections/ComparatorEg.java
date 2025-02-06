package collections;
import java.util.*;

class Student{
	
	private String name;
	private double gpa;
	
	public Student(String name, double gpa) {
//		super();
		this.name = name;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
}

public class ComparatorEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("Rima", 8.9));
		students.add(new Student("Sohini", 8.5));
		students.add(new Student("Prakash", 8.1));
		students.add(new Student("Tisha", 8.5));
		
		//method 1
		//first comparing by gpa then reverse then again comparing by name
//		Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
//		students.sort(comparator);
		
		//method 2
		Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
		students.sort((o1,o2) -> {
			if(o2.getGpa() - o1.getGpa() > 0) {
				return 1;
			}
			else if(o2.getGpa() - o1.getGpa() < 0) {
				return -1;
			}
			else {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		for(Student s: students) {
			System.out.println(s.getName() + " : "+ s.getGpa());
		}
		Collections.sort(students,comparator);

	}

}
