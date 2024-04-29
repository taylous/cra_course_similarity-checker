package cores;

import java.util.Set;
import java.util.stream.Collectors;

public class AlphabetCount {

    public AlphabetCount() {}

    public double checkUsedAlphabet(String compareToStr1, String compareToStr2) {
        Set<Character> str1Set = compareToStr1.chars().mapToObj(ch -> (char) ch).collect(Collectors.toSet());
        Set<Character> str2Set = compareToStr2.chars().mapToObj(ch -> (char) ch).collect(Collectors.toSet());

        if(str1Set.containsAll(str2Set)) {
            return 40.0;
        }
        return 0.0;
    }
}
