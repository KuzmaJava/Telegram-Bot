package stream.api.solution;

import com.speedment.example.unit.Unit1Create;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public final class Unit1MyCreate implements Unit1Create {

    @Override
    public Stream<String> newStreamOfAToC() {
        Stream<String> stream = Stream.of("A", "B", "C");
        return stream;
    }

    @Override
    public IntStream newIntStreamOfOneToSeven() {
        IntStream stream = IntStream.of(1, 2, 3, 4, 5, 6, 7);
        return stream;
    }

    @Override
    public Stream<String> from(String[] array) {
        Stream<String> stream = Stream.of(array);
        return stream;
    }

    @Override
    public Stream<String> from(Collection<String> collection) {
        Stream<String> stream = collection.stream();
        return stream;
    }

    @Override
    public IntStream from(String s) {
        IntStream intStream = s.chars();
        return intStream;
    }

    @Override
    public IntStream infiniteAlternating() {
        IntStream infiniteStream = IntStream.iterate(1, i -> i * (-1));
        return infiniteStream;
    }

    @Override
    public IntStream infiniteRandomInts(Random rnd) {
        IntStream infiniteStream = IntStream.iterate(rnd.nextInt(), i -> rnd.nextInt());
        return infiniteStream;
    }

    @Override
    public Stream<String> linesFromPoemTxtFile() throws IOException {
        Path path = Paths.get("poem.txt");
        Stream<String> lineStream = Files.lines(path);
        return lineStream;
    }
}
