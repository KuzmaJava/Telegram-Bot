package stream.api.solution;

import com.speedment.example.unit.Unit2Intermediate;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public final class Unit2MyIntermediate implements Unit2Intermediate {

    @Override
    public Stream<String> wordsLongerThanThreeChars(Stream<String> stream) {
        Stream<String> newStream = stream.
                filter(oldStream -> oldStream.length() > 3);
        return newStream;
    }

    @Override
    public Stream<String> firstTwoWordsLongerThanThreeChars(Stream<String> stream) {
        Stream<String> newStream = stream.
                filter(oldStream -> oldStream.length() > 3)
                .limit(2);
        return newStream;
    }

    @Override
    public Stream<String> firstDistinctTwoWordsLongerThanThreeCharsInAlphabeticOrder(Stream<String> stream) {
        Stream<String> newStream = stream.
                filter(oldStream -> oldStream.length() > 3)
                .distinct()
                .limit(2)
                .sorted();
        return newStream;
    }

    @Override
    public IntStream lengthOfWords(Stream<String> stream) {
        IntStream intStream = stream.
                mapToInt(oldStream -> oldStream.length());
        return intStream;
    }

    @Override
    public IntStream increasingSawtooth() {
        IntStream intStream = IntStream.range(0, Integer.MAX_VALUE).flatMap(i -> IntStream.range(0, i));
        return intStream;
    }

    @Override
    public Stream<String> strings(Stream<Object> stream) {
        Stream<String> newStream = stream.
                filter(String.class::isInstance)
                .map(String.class::cast);
        return newStream;
    }
}
