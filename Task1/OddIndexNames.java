package module11.Task1;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddIndexNames {
    public static String getOddIndexNames(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(index -> index % 2 != 0)
                .mapToObj(index -> (index + 1) + ". " + names.get(index))
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Maria", "Peter", "Anna", "Alex", "Nina");
        String result = getOddIndexNames(names);
        System.out.println(result);
    }
}
