package demo_steamapi;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class DemoStreamExemple {
    public static void main(String[] args) {
        List<Integer> numbers = new java.util.ArrayList<>(List.of(10, 5, 3, 12, 6, 7, 5, 3));

      //1.  Duyệt numbers
        numbers.stream().forEach(System.out::println);
        System.out.println("********************************");
      //2.  Tìm các giá trị chẵn trong list
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
        System.out.println("**********************");
      //3.  Tìm các giá trị > 5 trong list
        numbers.stream().filter(n -> n > 5).forEach(System.out::println);
        System.out.println("***************************");
      //4.  Tìm giá trị max trong list
       Optional<Integer> maxOptional = numbers.stream().max((a , b)-> a - b);
       maxOptional.ifPresent(System.out::println);
        System.out.println("*************************");

        numbers.stream()
                .sorted(Comparator.comparingInt(a -> (int) a).reversed())
                .limit(1)
                .forEach(System.out::println);
        System.out.println("************************");
      //5.  Tìm giá trị min trong list

        numbers.stream()
                .sorted(Comparator.comparingInt(a -> (int) a))
                .limit(1)
                .forEach(System.out::println);
        System.out.println("********************");
      //6.  Tính tổng các phần tử của mảng
       int sum =  numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum + "\n");
        System.out.println("******************");
      //7.  Lấy danh sách các phần tử không trùng nhau
        numbers.stream().distinct().forEach(System.out::println);
        System.out.println("************************");
      //8.  Lấy 5 phần tử đầu tiên trong mảng
        numbers.stream().limit(5).forEach(System.out::println);
        System.out.println("*******************");
      //9.  Lấy phần tử từ thứ 3 -> thứ 5
        numbers.stream().skip(2).limit(3).forEach(System.out::println);
        System.out.println("*********************");
      //10.  Lấy phần tử đầu tiên > 5
      Optional<Integer> optionalFrisNum5 =  numbers.stream().filter(n -> n>5).findFirst();
      optionalFrisNum5.ifPresent(System.out::println);
        System.out.println("****************");
      //11.  Kiểm tra xem list có phải là list chẵn hay không
       boolean isListOdd = numbers.stream().allMatch(n -> n % 2 == 0);
        System.out.println(isListOdd + "\n");
        System.out.println("*****************");

      //12.  Kiểm tra xem list có phần tử > 10 hay không

        boolean listHasElement10 = numbers.stream().anyMatch(n -> n > 10);
        System.out.println(listHasElement10 + "\n");
        System.out.println("******************");
      //13.  Có bao nhiêu phần tử > 5
       long countElement5 =  numbers.stream().filter(n -> n >5).count();
        System.out.println(countElement5 + "\n");
        System.out.println("**********************");
      //14.  Nhân đôi các phần tủ trong list và trả về list mới
        List<Integer> numberx2 = numbers.stream().map(n -> n * 2 ).toList();
        numberx2.stream().forEach(System.out::println);
        System.out.println("********************");
      //15.  Kiểm tra xem list không chứa giá trị nào = 8 hay không
        boolean listNotContain8 = numbers.stream().noneMatch(n -> n == 8);
        System.out.println(listNotContain8 +"\n");
        System.out.println("******************");

    }
}
