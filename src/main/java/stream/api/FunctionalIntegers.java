package stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalIntegers {


    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList(Arrays.asList(3, 4, 12, 2, 5, 2, 3));

        List<Integer> doubleList = returnNewListWithEvenNumbersFilteredFromTheNumbersList(integerList);
        System.out.println(doubleList);
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

    private static Integer printMaxNumberOfList(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, Integer::max);
    }

    private static Integer squareEveryNumberInAListAndFindTheSumOfSquares(List<Integer> numbers) {
        return numbers.stream()
                .map(x -> x * x)
                .reduce(0, Integer::sum);
    }

    private static Integer findSumOfOddNumbersInAList(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 != 0)
                .reduce(0, Integer::sum);
    }

    private static void printAllNumbersWithoutRepetition(List<Integer> numbers) {
        numbers.stream()
                .distinct()
                .forEach(System.out::println);
    }

    private static List<Integer> doubleList(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());
    }

    private static List<Integer> returnNewListWithEvenNumbersFilteredFromTheNumbersList(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .distinct()
                .collect(Collectors.toList());
    }
}
