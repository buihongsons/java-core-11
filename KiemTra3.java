import java.util.Random;

public class KiemTra3 {
    public static void main(String[] args) {
        Random rd = new Random();
        int n = rd.nextInt(100)+1;
        System.out.println( n +  " kiểm tra số đó có là số nguyên tố không " + isPrimeNumber(n));

    }

    public static boolean isPrimeNumber(int n) {
       if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
           if (n % i == 0) {
               return false;
           }
        }
        return true;
    }
}

