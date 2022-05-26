import java.util.Optional;

public class DemoOptionalMethod {
    public static void main(String[] args) {
        // tạo đối tượng optional
        //1. tạo optional rỗng
        Optional<String> optionalEmpty = Optional.empty();
        System.out.println(optionalEmpty);

        //2. tạo optional có giá trị khác null
        Optional<String> stringOptional = Optional.of("Hello");
        System.out.println(stringOptional);

        // ****** Một số phương thức *******
        // get() : lấy ra giá trị trong optional
        // isPresent() và ifPresent(): Kiểm tra optional có giá trị hay không

//        if(optionalEmpty.isPresent()){
//            System.out.println("Giá trị là : " + optionalEmpty.get());
//        }else {
//            System.out.println("không có giá trị");
//        }
        if (optionalEmpty.isEmpty()) {
            System.out.println("không có giá trị");
        } else {
            System.out.println("Giá trị là : " + optionalEmpty.get());
        }

        //
        if (stringOptional.isEmpty()) {
            System.out.println("không có giá trị");
        } else {
            System.out.println("Giá trị là : " + stringOptional.get());
        }
        // ifPresent : nếu optional cps giá trị bên trong thì làm 1 hành động gì đó
        stringOptional.ifPresent(s -> System.out.println("Giá trị là :" + s));

        //*********************************
        // orElse : trả về giá trị của đối tương optional nếu giá trị = rỗng
        //
        String value = stringOptional.orElse("Default value");
        System.out.println(value);

        // orElseThrow()
        // Neus optional cps giá trị -> trả về giá trị đó
        // Ngược lại -> throw exception
        String value2 = stringOptional.orElseThrow(() -> {
            throw new RuntimeException("Có lỗi xảy ra");
        });
        System.out.println(value2);

        //
        try {

            String value3 = stringOptional.orElseThrow(() -> {
                throw new RuntimeException("Có lỗi xảy ra");
            });
            System.out.println(value3);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}