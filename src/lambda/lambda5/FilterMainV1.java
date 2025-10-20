package lambda.lambda5;

import java.util.ArrayList;
import java.util.List;

public class FilterMainV1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = filterEvenNumber(numbers);
        System.out.println("evenNumbers = " + evenNumbers);

        // 홀수만 거르기
        List<Integer> oddNumber = filterOddNumber(numbers);
        System.out.println("oddNumber = " + oddNumber);
    }


    static List<Integer> filterEvenNumber(List<Integer> numbers) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                filtered.add(number);
            }
        }
        return filtered;
    }

    static List<Integer> filterOddNumber(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                result.add(number);
            }
        }
        return result;
    }
}
