package module11.Task3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberSorter {

    public static void main(String[] args) {
        String[] inputArray = {"1, 2, 0", "4, 5"};
        String result = getSortedNumbers(inputArray);
        System.out.println(result);  // Виведе: "0, 1, 2, 4, 5"
    }

    public static String getSortedNumbers(String[] inputArray) {
        List<Integer> numbers = new ArrayList<>();

        for (String str : inputArray) {
            String[] parts = str.split(",\\s*");
            for (String part : parts) {
                numbers.add(Integer.parseInt(part));
            }
        }

        Collections.sort(numbers);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numbers.size(); i++) {
            result.append(numbers.get(i));
            if (i < numbers.size() - 1) {
                result.append(", ");
            }
        }

        return result.toString();
    }
}