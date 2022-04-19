

public class BaiTapMethod {
    public static void main(String [] args){
        // Cộng
        int data = addition( 5,  15);
        System.out.println(data);
        // Trừ
        int data1 = subtraction( 30, 20);
        System.out.println(data1);
        // Nhân
        int data2 = multiplication( 5, 10);
        System.out.println(data2);
        // Chia
        int data3 = division( 50, 5);
        System.out.println(data3);
        // BMI
        float weight = 63f;
        double height = 1.68;
        System.out.println(weight/Math.pow(height,2));
    }
    public static int addition(int a, int b){
        return a + b;
    }
    public static int subtraction( int a, int b){
        return a - b;
    }
    public static int multiplication(int a, int b){
        return a * b;
    }
    public static int division( int a, int b){
        return a / b;
    }

}