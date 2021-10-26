package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("the student name is subha ");
	}
	public void studentDept() {
		System.out.println("the department is physics");
	}
	public void studentId() {
		System.out.println("the id is 12345");
	}
	public static void main(String[] args) {
		Student multi = new Student();
		multi.collegeName();
		multi.collegeCode();
		multi.collegeRank();
		multi.deptName();
		multi.studentDept();
		multi.studentId();
		multi.studentName();
		
	}
	

}
