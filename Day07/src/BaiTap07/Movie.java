package BaiTap07;

public class Movie extends Film{
    private int thoiluong;

    public Movie() {
    }

    public Movie(int id, String tieude, String theloai, String daodien, String ngaycongchieu, int thoiluong) {
        super(id, tieude, theloai, daodien, ngaycongchieu);
        this.thoiluong = thoiluong;
    }

    public int getThoiluong() {
        return thoiluong;
    }

    public void setThoiluong(int thoiluong) {
        this.thoiluong = thoiluong;
    }

    @Override
    public void showInforr() {
        super.showInforr();
        System.out.printf("%10d\n",this.thoiluong);
    }
}
