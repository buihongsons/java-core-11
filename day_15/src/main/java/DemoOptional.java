import java.util.Optional;

public class DemoOptional {
    public static void main(String[] args) {
        // tạo đối tượng optional
        //1. tạo optional rỗng
        Optional<String> optionalEmpty = Optional.empty();
        System.out.println(optionalEmpty);

        //2. tạo optional có giá trị khác null
        Optional<String> stringOptional = Optional.of("Hello");
        System.out.println(stringOptional);

        //3. tạo optional có giá trị cụ thể
        // Giá trị có thể null hoặc không
        Optional<Integer> integerOptional = Optional.ofNullable(1);
        Optional<Integer> integerOptional1 = Optional.ofNullable(null);

        System.out.println(integerOptional);
        System.out.println(integerOptional1);
    }
}
