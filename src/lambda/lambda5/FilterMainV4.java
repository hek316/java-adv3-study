package lambda.lambda5;

import java.util.List;

public class FilterMainV4 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = IntegerFilter.filter(numbers, n1 -> n1 % 2 == 0);
        System.out.println("evenNumbers = " + evenNumbers);

        // 홀수만 거르기
        List<Integer> oddNumber =  IntegerFilter.filter(numbers, n -> n % 2 != 0);
        System.out.println("oddNumber = " + oddNumber);
    }


}
