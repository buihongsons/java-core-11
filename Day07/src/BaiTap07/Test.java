package BaiTap07;

import BaiTap07.service.FilmSevice;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        FilmSevice filmSevice = new FilmSevice();
        Movie [] movies = {
                new Movie(1,"Ngay Dau Tien Di Hoc","Tam Ly Tinh Cam","Khong Biet","26/4/2022",120),
                new Movie(2,"Nghin Le Mot Dem","Phieu Luu Ky Thu","Mai Noi","27/8/2022",140),
                new Movie(3,"Em Chua 18"," Tinh Cam","Khong Co","4/4/2022",130),
                new Movie(4,"Ac Mong Tuoi 24","Kinh DI","Tu Lam","7/4/2022",150)
        };


        Serial [] serials ={
                new Serial(1,"Jujutsukaisen","Hoat Hinh","Nguoi Nhat Ban","1/5/2022",1,128),
                new Serial(2,"SenPai Em Chua","Hanh Dong","Japan","1/6/2023",2,138),
                new Serial(3,"MyLove","Tinh Cam"," Nhat Ban","1/7/2024",3,148),
                new Serial(4,"Jujutsukaisen","Hoat Hinh","Nguoi Nhat Ban","1/8/2025",4,158)

        };

        for (Movie mv : movies){
            mv.showInforr();
        }
        System.out.println();
        for (Serial sr : serials){
            sr.showInforr();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten phim muon tim: ");
        String name = sc.nextLine();
        filmSevice.timKiem(movies,serials,name);
    }
    
}
