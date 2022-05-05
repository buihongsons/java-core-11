import java.util.Scanner;

public class KiemTra5 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int soDong;
        int soCot;


        System.out.println("Nhap Vao So Dong Cua Mang : ");
        soDong = sc.nextInt();
        System.out.println("Nhap Vao So Cot Cua Mang : ");
        soCot = sc.nextInt();


        int[][] boArd = new int[soDong][soCot];

        for (int i = 0; i < soDong; i++) {
            for (int h = 0; h < soCot; h++) {
                System.out.print("Nhap Cac Phan Tu [" + i + ", " + h + "]: ");
                boArd[i][h] = sc.nextInt();
            }
        }
        System.out.println("Thong Tin Cua Mang");
        for (int i = 0; i < soDong; i++) {
            for (int h = 0; h < soCot; h++) {
                System.out.print(boArd[i][h] + "\t");
            }
            System.out.println("\n");
        }
    }
}
