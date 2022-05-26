package demo_steamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DemoSteam {
    public static void main(String[] args) {
        //1 số cách tạo ra steam
        // cách 1. Sử dựng Steam.of()
        Stream<Integer> number = Stream.of(1,2,3,4,5);

        // cách 2 : Sử dụng Stream.builder()
        Stream<String> names = Stream.<String>builder()
                .add("Sơn")
                .add("Long")
                .add("Toàn")
                .build();

        // Cách 3 : sử dụng range
        IntStream intStream = IntStream.range(1,10);


        // Cách 4 : Sử dụng Array.stream

        int [] numbers1 = {1,2,3,4,5};
        IntStream intStream1 = Arrays.stream(numbers1);

        // cách 5: Tạo Stream từ Collection(Sử dụng Nhiều)
        List<Integer> list = List.of(1,2,3,4,5);
        Stream<Integer> listStream = list.stream();
    }
}
