package lambda.lambda3;

public class GenericMain1 {

    public static void main(String[] args) {

        StringFunction upperCase = s -> s.toUpperCase();
        System.out.println("upperCase.apply(\"hello\") = " + upperCase.apply("hello"));

        NumberFunction squre = i -> i * i;
        Integer apply = squre.apply(100);
        System.out.println("apply = " + apply);


    }


    @FunctionalInterface
    interface StringFunction {
        String apply(String s);
    }

    @FunctionalInterface
    interface NumberFunction {
        Integer apply(Integer i);
    }
}
