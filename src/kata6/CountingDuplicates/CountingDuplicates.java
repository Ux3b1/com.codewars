package kata6.CountingDuplicates;

import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class CountingDuplicates {
    public static int duplicateCount(String text) {

        Map<Character, Long> mapX = text.codePoints()
                .map(Character::toLowerCase)
                .mapToObj(c -> (char) c)
                .collect(groupingBy(identity(), counting()));

        return (int) mapX.entrySet().stream()
                .filter(el -> el.getValue() > 1)
                .count();
    }

    /*

       HashMap<String, Integer> mapX = Arrays.stream(text.split(""))
                .map(String::toLowerCase)
                .collect(
                        HashMap::new,
                        (map, item) -> map.merge(item, 1, (v,v2) -> v + 1),
                        HashMap::putAll);


        private static Map<Character, Long> charFrequenciesMap(final String text) {
        return text.codePoints()
            .map(Character::toLowerCase)
            .mapToObj(c -> (char) c)
            .collect(groupingBy(identity(), counting()));
    }
     */
}