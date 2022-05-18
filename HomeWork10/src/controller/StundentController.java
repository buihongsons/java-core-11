package controller;

import models.Student;
import service.StudentEpm;

import java.util.ArrayList;
import java.util.Scanner;

public class StundentController {
    public StudentEpm studentEpm = new StudentEpm();
    private void printMenu(){
        System.out.println("***** MENU *****");
        System.out.println("1. Xem danh sach hoc sinh");
        System.out.println("2. Them hoc sinh moi");
        System.out.println("3. Cap nhat diem hoc sinh");
        System.out.println("4. Xoa hoc sinh");
        System.out.println("5. Xem danh sach hoc sinh theo lop");
        System.out.println("6. Sap xep theo ten");
        System.out.println("7. Sap xep theo tuoi");
        System.out.println("8. Sap xep theo diem");
        System.out.println("9. Thoat");
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        boolean isContinue =true;
        int option;
        while (isContinue){
            printMenu();
            System.out.println("Nhap lua chon : ");
            option = Integer.parseInt(sc.nextLine());
            switch (option){
                case 1:{
                    System.out.println("Danh sach hoc sinh ");
                    studentEpm.printListStudent(studentEpm.getStudents());
                    break;
                }
                case 2:{
                    System.out.println("Them hoc sinh moi ");
                    Student student = studentEpm.addNewStudent();
                    System.out.println("Hoc sinh moi nhap la: ");
                    System.out.println(student);
                    break;
                }
                case 3:{
                    System.out.println("Cap nhap diem hoc sinh");
                    System.out.print("Nhap id hoc sinh muon cap nhat: ");
                    int id = Integer.parseInt(sc.nextLine());
                    Student student = studentEpm.updateStudenPoint(id);
                    System.out.println("Hoc sinh sau khi duoc cap nhat ");
                    System.out.println(student);
                    break;
                }
                case 4:{
                    System.out.println("Xoa hoc sinh");
                    System.out.print("Nhap id hoc sinh muon xoa : ");
                    int id = Integer.parseInt(sc.nextLine());
                    studentEpm.deleteStudent(id);
                    break;
                }
                case 5:{
                    System.out.println("Xem hoc sinh theo lop");
                    System.out.print("Nhap ten lop : ");
                    String name = sc.nextLine();
                    ArrayList<Student> list = studentEpm.printByClass(name);
                    System.out.println("Danh sach hoc sinh theo lop " + name);
                    studentEpm.printByClass(String.valueOf(list));
                    break;
                }
                case 6:{
                    System.out.println("Sap xep hoc sinh theo ten ");
                    studentEpm.printListStudent(studentEpm.arrangementByName(studentEpm.getStudents()));
                    break;
                }
                case 7:{
                    System.out.println("Sap xep hoc sinh theo id");
                    studentEpm.printListStudent(studentEpm.arrangementById(studentEpm.getStudents()));
                    break;
                }
                case 8:{
                    System.out.println("Sap xep hoc sinh theo diem");
                    studentEpm.printListStudent(studentEpm.arrangementByPoint(studentEpm.getStudents()));
                    break;
                }
                case 9:{
                    isContinue = false;
                    System.out.println("Thoat khoi chuong trinh");
                    break;
                }
                default:{
                    System.out.println("Lua chon khong phu hop ");
                    break;
                }
            }
        }
    }

}
