package service;

import exception.NotFoundException;
import models.Student;

public class Test {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        //1. in ra thông tin học viên

        try {
            studentService.printStudents();

        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        //2. tìm kiếm học viên theo id
        try{
            Student student = studentService.getStudentById(1);
            System.out.println(student);

            Student student1 = studentService.getStudentById(9);
            System.out.println(student1);
        }catch (NotFoundException e ){
            System.out.println(e.getMessage());
        }


        System.out.println();
        //3. tìm kiếm học viên theo email
        try{
            // học viên có email hợp lệ
            Student student = studentService.getStudentByEmail("Son@gmail.com");
            System.out.println(student);

            Student student1 = studentService.getStudentByEmail("uan@gmail.com");
            System.out.println(student1);
        }catch (NotFoundException e ){
            System.out.println(e.getMessage());
        }
        System.out.println();
        // Xóa student theo id
        try{
            // xóa student có id hợp lệ
            studentService.deleteStudent(1);
            studentService.printStudents();
            // xóa id không hợp lệ
            studentService.deleteStudent(10);
            studentService.printStudents();
        }catch (NotFoundException e ){
            System.out.println(e.getMessage());
        }
    }
}
