package lambda.lambda3;

public class GenericMain6 {

    public static void main(String[] args) {

        GenericFunction<String, String> upperCase = s -> s.toUpperCase();
        GenericFunction<String, Integer> stringLength = s -> s.length();
        GenericFunction<Integer, Integer> square = s -> s * s;
        GenericFunction<Integer, Boolean> isEven = num -> num % 2 == 0;

        System.out.println(upperCase.apply("Hello"));
        System.out.println(stringLength.apply("Hello"));
        System.out.println(square.apply(5));
        System.out.println(isEven.apply(5));


    }


    @FunctionalInterface
    interface GenericFunction<T, R> {
        R apply(T s);
    }

}
