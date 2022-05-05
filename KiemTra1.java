import java.util.Scanner;

public class KiemTra1{

    public static void main(String[] args) {
         HinhTamGiac();
        int height;
        int width;
        int i;
        Scanner sc = new Scanner(System.in);
// em lam bai hinh vuong, thay nhap height widht bang nhau
        System.out.print("height = ");
        height = sc.nextInt();
        System.out.print("width = ");
        width = sc.nextInt();

        for(i = 1; i <= height; i++){
            for(int j = 1; j <= width; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }

        sc.close();
    }
    public static void HinhTamGiac(){
        for (int i =1; i<=4; i++){
            for (int j = 0; j<i;j++){
                System.out.print("*  ");
            }
            System.out.print("\n");
        }
    }
}