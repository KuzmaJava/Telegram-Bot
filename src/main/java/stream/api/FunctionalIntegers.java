package stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionalIntegers {


    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList(Arrays.asList(1, 2, 12, 7, 5, 2, 1));

        System.out.println(addAllNumbers(integerList));
    }

    private static void printAllNumbersInList(List<Integer> numbers) {
        numbers.stream()
                .forEach(System.out::println);
    }

    private static void printEvenNumbersInList(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }

    private static void printOddNumbersInList(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .forEach(System.out::println);
    }

    private static void printCubesOfOddNumbersInList(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .map(number -> number * number * number)
                .forEach(System.out::println);
    }

    private static void printSquaresOfEvenNumbersInList(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .forEach(System.out::println);
    }

    private static Integer addAllNumbers(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, Integer::sum);
// the same as above line           .reduce(0, (x, y) -> x + y);
    }
}
