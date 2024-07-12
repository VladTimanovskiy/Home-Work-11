package module11.Task2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringListProcessor {

    public static void main(String[] args) {
        List<String> inputList = List.of("apple", "orange", "banana", "grape", "kiwi");
        List<String> result = processStrings(inputList);
        System.out.println(result);
    }

    public static List<String> processStrings(List<String> inputList) {
        List<String> upperCaseList = new ArrayList<>();

        for (String str : inputList) {
            upperCaseList.add(str.toUpperCase());
        }

        Collections.sort(upperCaseList, Collections.reverseOrder());

        return upperCaseList;
    }
}
