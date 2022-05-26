package service;

import exception.NotFoundException;
import models.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentService {
    // tạo danh sách Stundent để quản lý
    private List<Student> students;

    public StudentService(){
        students = new ArrayList<>();
        students.add(new Student(1,"Son","Son@gmail.com"));
        students.add(new Student(2,"Tung","Tung@gmail.com"));
        students.add(new Student(3,"Tuan","Tuan@gmail.com"));
        students.add(new Student(4,"Nhung","Nhung@gmail.com"));

    }
    // 1. in ra danh sách Student
    public void printStudents(){
        if(students.isEmpty()){
            throw new NotFoundException("List student is empty!");
        }
        students.forEach(System.out::println);
    }
    //2. tìm kiếm student theo id
    public Student getStudentById(int id){
        Optional<Student> optionalStudent = findStudent(id);
        if (optionalStudent.isPresent()){
            return optionalStudent.get();
        }
        throw new NotFoundException("Can't find student with id = "+ id);
    }
    //3. tìm kiếm student theo email
    public Student getStudentByEmail(String email){
        Optional<Student> optionalStudent = findStudent(email);
        return optionalStudent.orElseThrow(()-> {
            throw new NotFoundException("Can't find student with email " + email);
        });
    }
    //4. xóa student theo id
    public void deleteStudent(int id){
        // kiểm tra Student có tồn tại hay không
        if(findStudent(id).isEmpty()){
            throw new NotFoundException("không có id này = "+ id);
        }
        // nếu tồn tại thì xóa Studen
        students.removeIf(s -> s.getId() == id);

    }
    // helper Method
    //1. tìm kiếm học viên theo id -> đối tượng optional
    public Optional<Student> findStudent(int id){
        return students.stream().filter(s->s.getId()==id).findFirst();
    }
    //2. tìm kiếm học viên theo email -> trả về optional
    public Optional<Student> findStudent(String email){
        return students.stream().filter(s ->s.getEmail().equals(email)).findFirst();
    }
}
