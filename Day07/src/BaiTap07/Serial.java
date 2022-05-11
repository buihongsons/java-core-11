package BaiTap07;

public class Serial extends Film{
    private int sotap;
    private int thoiluongtrungbinh;

    public Serial() {
    }

    public Serial(int id, String tieude, String theloai, String daodien, String ngaycongchieu, int sotap, int thoiluongtrungbinh) {
        super(id, tieude, theloai, daodien, ngaycongchieu);
        this.sotap = sotap;
        this.thoiluongtrungbinh = thoiluongtrungbinh;
    }

    public int getSotap() {
        return sotap;
    }

    public void setSotap(int sotap) {
        this.sotap = sotap;
    }

    public int getThoiluongtrungbinh() {
        return thoiluongtrungbinh;
    }

    public void setThoiluongtrungbinh(int thoiluongtrungbinh) {
        this.thoiluongtrungbinh = thoiluongtrungbinh;
    }

    @Override
    public void showInforr() {
        super.showInforr();
        System.out.printf("%10d %10d\n",this.sotap,this.thoiluongtrungbinh);
    }
}
