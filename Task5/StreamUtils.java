package module11.Task5;

import java.util.Iterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamUtils {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();

        return IntStream.iterate(0, i -> i + 1)
                .boxed()
                .takeWhile(i -> iterator1.hasNext() && iterator2.hasNext())
                .flatMap(i -> Stream.of(iterator1.next(), iterator2.next()));
    }

    public static void main(String[] args) {
        Stream<String> first = Stream.of("A", "B", "C");
        Stream<String> second = Stream.of("1", "2", "3", "4");

        Stream<String> zipped = zip(first, second);
        zipped.forEach(System.out::println);
    }
}