package stream.api;

import java.util.Arrays;
import java.util.List;

public class Functional {

    public static void main(String[] args) {
        printAllNumbersInListFunctional(Arrays.asList(1, 2, 12, 7, 4, 2, 1));
    }

    /**
     * Print all numbers
     *
     * @param numbers list of numbers
     */
    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .forEach(Functional::print);
    }

    public static void print(Integer number) {
        System.out.println(number);
    }

}
