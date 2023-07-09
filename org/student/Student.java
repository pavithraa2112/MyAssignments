package org.student;
import org.department.Department;
public class Student extends Department {
	public void StudentName() {
		System.out.println("Name of the student: Pavithraa");
	}
	public void studentDept() {
		System.out.println("Department of the Student:EIE");
	}
	public void studentID() {
		System.out.println("ID:201");
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.CollegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.StudentName();
		s.studentID();
		s.studentDept();
	}
}

