package com.mea.dao;

import java.util.List;

import com.mea.model.Student;


public interface StudentDao {
	public boolean verifyStudentDao(Student student);

	public List<Student> getStudentDao();

	public List<Student> deleteStudentDao(int studentId);

	public Student getStudentForEditDao(int id);

	public List<Student> updateStudentDao(Student student);

	public List<Student> searchStudentDao(String searchKey);

	
}
