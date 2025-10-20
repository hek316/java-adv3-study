package lambda.lambda5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class GenericFilter {

    public static <T> List<T> filter(List<T> numbers, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T num : numbers) {
            if (predicate.test(num)) {
                result.add(num);
            }
        }
        return result;
    }
}
