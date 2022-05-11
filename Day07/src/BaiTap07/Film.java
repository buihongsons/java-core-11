package BaiTap07;

import org.jetbrains.annotations.NotNull;
import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;

public class Film {
    //id, tiêu đề, thể loại, đạo diễn, ngày công chiếu
    private int id;
    private String tieude;
    private String theloai;
    private String daodien;
    private String ngaycongchieu;


    public Film() {
    }

    public Film(int id, String tieude, String theloai, String daodien, String ngaycongchieu) {
        this.id = id;
        this.tieude = tieude;
        this.theloai = theloai;
        this.daodien = daodien;
        this.ngaycongchieu = ngaycongchieu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getDaodien() {
        return daodien;
    }

    public void setDaodien(String daodien) {
        this.daodien = daodien;
    }

    public String getNgaycongchieu() {
        return ngaycongchieu;
    }

    public void setNgaycongchieu(String ngaycongchieu) {
        this.ngaycongchieu = ngaycongchieu;
    }


   public void showInforr(){
       System.out.printf("%5d %10s %10s %10s %10s",this.id,this.tieude,this.theloai,this.daodien,this.ngaycongchieu );
   }

}
