package module11.Task2;
import java.util.List;
import java.util.stream.Collectors;

public class StringProcessing {
    public static List<String> processStrings(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Maria", "Peter", "Anna", "Alex", "Nina");
        List<String> result = processStrings(names);
        result.forEach(System.out::println);
    }
}
