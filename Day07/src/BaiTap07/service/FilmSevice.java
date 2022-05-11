package BaiTap07.service;

import BaiTap07.Movie;
import BaiTap07.Serial;

public class FilmSevice {
    public void timKiem (Movie[] mv, Serial[] sr, String name){
        int count = 0;
        for ( Movie movie : mv ) {
            if (movie.getTieude().contains(name)){
                movie.showInforr();
                count++;
            }
        }
        for (Serial serial : sr){
            if (serial.getTieude().contains(name)){
                serial.showInforr();
                count++;
            }
        }
        if(count == 0){
            System.out.println("Khong tim thay phim nay !!");
        }


    }
}
