package lambda.lambda5;

import java.util.List;

public class FilterMainV5 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 숫자 사용 필터
        List<Integer> evenNumbers = GenericFilter.filter(numbers, n1 -> n1 % 2 == 0);
        System.out.println("evenNumbers = " + evenNumbers);

        // 문자 사용 필터
        List<String> strings = List.of("a", "bb", "cccc", "d", "e", "f", "g", "h", "i");
        List<String> stringsResult =  GenericFilter.filter(strings, s -> s.length() >= 2);
        System.out.println("stringsResult = " + stringsResult);
    }


}
