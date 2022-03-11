package stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalStrings {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList(Arrays.asList("Stri", "Str", "Hambu"));

        List<Integer> newList = createListWithLengthsOfAllCourseTitles(stringList);
        System.out.println(" New list : " + newList);

        printTheNumberOfCharactersInEachCourseName(stringList);
    }

    private static void printAllCourses(List<String> courses) {
        courses.stream()
                .forEach(System.out::println);
    }

    private static void printCoursesContainingWordString(List<String> courses) {
        String string = "string";
        courses.stream()
                .filter(course -> course.toLowerCase().indexOf(string.toLowerCase()) != -1)
                .forEach(System.out::println);
    }

    private static void printCoursesWhoseNameAtLeastFourLetters(List<String> courses) {
        courses.stream()
                .filter(course -> course.length() >= 4)
                .forEach(System.out::println);
    }

    private static void printTheNumberOfCharactersInEachCourseName(List<String> courses) {
        courses.stream()
                .map(course -> course + " " + course.length())
                .forEach(System.out::println);
    }

    private static List<Integer> createListWithLengthsOfAllCourseTitles(List<String> courses) {
        return courses.stream()
                .map(course -> course.length())
                .collect(Collectors.toList());
    }


}
