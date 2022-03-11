package stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.LongBinaryOperator;
import java.util.stream.Collectors;

public class MainStream {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList(Arrays.asList(3, 4, 12, 2, 5, 2, 3));

        Function<Integer, Integer> doubleFunction = number -> number * number;
        List<Integer> newList = integerList.stream()
                .map(doubleFunction)
                .collect(Collectors.toList());
        System.out.println("Initial list : " + integerList);
        System.out.println("New list : " + newList);

        LongBinaryOperator longBinaryOperator = (x, y) -> x + y;

    }
}
