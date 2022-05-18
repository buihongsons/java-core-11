package service;

import models.Student;

import java.util.*;

public class StudentEpm implements IStudentService {
    public ArrayList<Student> students = new ArrayList<>();
    private void init(){
        students.add(new Student(1,"Nguyen Van A",19,"Ha noi",6,"Java"));
        students.add(new Student(2,"Nguyen Van A",19,"Ha noi",6,"Java"));
        students.add(new Student(3,"Nguyen Van B",20,"Thai Binh",7,"HTML"));
        students.add(new Student(4,"Nguyen Van B",20,"Thai Binh",7,"HTML"));
        students.add(new Student(5,"Nguyen Van C",21,"Hoa Binh",8,"CSS"));
        students.add(new Student(6,"Nguyen Van C",21,"Hoa Binh",8,"CSS"));
        students.add(new Student(7,"Nguyen Van D",22,"Phu Tho",9,"PHP"));
        students.add(new Student(8,"Nguyen Van D",22,"Phu Tho",9,"PHP"));
        students.add(new Student(9,"Nguyen Van E",19,"Bac Giang",6,"PYTHON"));
        students.add(new Student(10,"Nguyen Van E",19,"Bac Giang",6,"PYTHON"));
    }
    public StudentEpm(){
        init();
    }
    public ArrayList<Student> getStudents(){
        return students;
    }





    @Override
    public void printListStudent(ArrayList<Student> list) {
        for (Student student:list) {
            System.out.println(student);
        }
    }
// them hoc sinh moi
    @Override
    public Student addNewStudent() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Nhap Ten : ");
        String name = sc.nextLine();
        System.out.print("Nhap Tuoi : ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Dia Chi : ");
        String address = sc.nextLine();
        System.out.print("Diem So : ");
        double point = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap Lop Hoc : ");
        String classroom = sc.nextLine();
        Student student = new Student(rd.nextInt(100)+6,name,age,address,point,classroom);
        students.add(student);
        return student;
    }
// cap nhat diem hoc sinh
    @Override
    public Student updateStudenPoint(int id) {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem moi cho hoc sinh : ");
        double point = Double.parseDouble(sc.nextLine());
        for (Student st :students) {
            if (st.getId() == id){
                student = st;
            }
        }
        student.setPoint(point);
        return student;
    }
// xoa hoc sinh
    @Override
    public void deleteStudent(int id) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.getId() == id){
                iterator.remove();
            }
        }
        System.out.println("Xoa Thanh Cong ");
    }
// xem danh sach theo lop
    @Override
    public ArrayList<Student> printByClass(String name) {
        ArrayList<Student> resul = new ArrayList<>();
        for (Student student:students){
            if (student.getClassroom().equalsIgnoreCase(name)){
                resul.add(student);
            }
        }
        return resul;
    }
// sap xep theo ten
    @Override
    public ArrayList<Student> arrangementByName(ArrayList<Student> list) {
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
        return list;
    }
// sap xep theo tuoi
    @Override
    public ArrayList<Student> arrangementById(ArrayList<Student> list) {
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()- o2.getAge();
            }
        });
        return list;
    }
// sap xep theo diem
    @Override
    public ArrayList<Student> arrangementByPoint(ArrayList<Student> list) {
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o1.getPoint()- o2.getPoint());
            }
        });
        return list;
    }
}
