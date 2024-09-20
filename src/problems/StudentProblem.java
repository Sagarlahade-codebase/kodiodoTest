package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	
	
	private String name;
	private int rollNo;
	private int marks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	public Student(String name, int rollNo, int marks) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", marks=" + marks + "]";
	}
	
	
}

public class StudentProblem {
	
	public static  List<Student> populate(List<Student> stdlst){
		
		stdlst.add(new Student("Sagar",1,67));
		stdlst.add(new Student("akash",2,89));
		stdlst.add(new Student("vikram",3,90));
		stdlst.add(new Student("Zakir",4,96));
		return stdlst;
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<Student> stdlst = new ArrayList<>();
		populate(stdlst);
		
		List<Student> sortedLst=stdlst.stream().sorted((s1,s2)->{
			if(s1.getRollNo()>s2.getRollNo()) {
				return -1;
			}else if(s1.getRollNo()<s2.getRollNo()) {
				return 1;
			}else {
				return 0;
			}
			
		}).collect(Collectors.toList());
		
		//Sorting list desending based on ROLL NO
		
		for(Student s: sortedLst) {
			System.out.println(s);
		}
	}

}
