import java.util.Scanner;

public class KiemTra4 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhap n :");
        int n = sc.nextInt();
        System.out.printf("So nguyen to nho hon 10  : \n", n);


        if (n >= 0){
            System.out.println("La");
        }
        for (int i = 1; i < n; i++){
            if(Number(i)){
                System.out.print(" " + i);
            }
        }

    }
    public static boolean Number(int n ){
        if(n<1){
            return false;
        }
        int x = (int) Math.sqrt(n);
        for (int i = 1; i < x; i++){
            if (n % i == 0 ){
                return false;
            }
        }
        return true;
    }

}
