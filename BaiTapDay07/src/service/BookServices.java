package service;

import models.Book;

import java.time.LocalDate;

public class BookServices {
    public Book[] getBooks(){
//        Tạo ra mảng book
        Book[] books ={
                new Book(1, "Luat Tam Thuc", "Ngo Sa Thach", "Khoa Hoc", "Sky Book", 2019),
                new Book(2, "Tren Duong Bang", "Tony", "Tam Ly", "Giao Duc", 2020),
                new Book(3, "Dac Nhan Tam", "Carnegie", "Chinh Tri", "Tuoi Tre", 2021),
                new Book(4, "Nhu Mot Thoi Quen", "Hong Son", "Tieu Thuyet", "Sky Book", 2022),
                new Book(5, "Mot Cuon Sach Hay", "Bui Hien", "Tam Linh", "Kim Dong", 2020)
        };
        return books;
    }

    public void findByTitle(String title){
        int cout =0;
        for (Book book:getBooks()
        ) {
            if (book.title.contains(title)){
                cout++;
                System.out.println(book);
            }
        }
        if (cout==0){
            System.out.println("Khong tim thay ket qua "+"\""+title+"\"");
        }
    }
    public void findByCategory(String category){
        int cout =0;
        for (Book book:getBooks()
        ) {
            if (book.category.contains(category)){
                cout++;
                System.out.println(book);
            }
        }
        if (cout==0){
            System.out.println("Khong tim thay ket qua "+"\""+category+"\"");
        }
    }

    public void findByPublishingOfThisYear(){
        int currentYear = LocalDate.now().getYear();
        int count = 0;
        for (Book book:getBooks()
        ) {
            if (book.year == currentYear){
                count++;
                System.out.println(book);
            }
        }
        if (count==0){
            System.out.println("Khong co sach xuat ban trong nam "+"\""+currentYear+"\"");
        }
    }
}
