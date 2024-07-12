package module11.Task1;

import java.util.List;

public class OddIndexNamesFormatter {

    public static void main(String[] args) {
        List<String> names = List.of("John", "Ivan", "Sarah", "Peter", "Michael");
        String result = formatNamesAtOddIndices(names);
        System.out.println(result);
    }

    public static String formatNamesAtOddIndices(List<String> names) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i < names.size(); i += 2) {
            result.append(i).append(". ").append(names.get(i));
            if (i + 2 < names.size()) {
                result.append(", ");
            }
        }

        return result.toString();
    }
}