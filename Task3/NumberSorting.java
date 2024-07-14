package module11.Task3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class NumberSorting {
    public static String sortNumbers(String[] array) {
        return Arrays.stream(array)  // Створюємо стрім з масиву рядків
                .flatMap(s -> Arrays.stream(s.split(", ")))  // Розбиваємо кожен рядок на окремі числа
                .map(Integer::parseInt)  // Перетворюємо рядки в числа
                .sorted()  // Сортуємо числа
                .map(String::valueOf)  // Перетворюємо числа назад в рядки
                .collect(Collectors.joining(", "));  // Збираємо результат в один рядок, розділяючи комами
    }

    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 5"};
        String result = sortNumbers(array);
        System.out.println(result);  // Виводимо результат на екран
    }
}
