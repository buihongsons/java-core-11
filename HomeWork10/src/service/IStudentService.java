package service;

import java.util.ArrayList;

import models.Student;

public interface IStudentService {
    void printListStudent(ArrayList<Student>list);
    Student addNewStudent();
    Student updateStudenPoint(int id);
    void deleteStudent(int id);
    ArrayList<Student> printByClass(String name);
    ArrayList<Student> arrangementByName(ArrayList<Student>list);
    ArrayList<Student> arrangementById(ArrayList<Student>list);
    ArrayList<Student> arrangementByPoint(ArrayList<Student>list);
}
