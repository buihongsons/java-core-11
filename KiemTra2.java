public class KiemTra2 {
    public static void main(String[] args) {
        char [] bt = {'o', 'r', 'i', 'g', 'i', 'n', 'a', 'l', 'o'};
        String abc = new String(bt);
        System.out.println(bt.length);
        for (String x : abc.split("o", 0)){
            System.out.println("so lan ky tu 0 xuat hien :");
        }
    }
}
