package cores;

import java.util.Set;
import java.util.stream.Collectors;

public class AlphabetCount {

    public AlphabetCount() {}

    private Set<Character> createCharacterSet(String targetStr) {
        return targetStr.chars().mapToObj(ch -> (char) ch).collect(Collectors.toSet());
    }

    public double checkUsedAlphabet(String compareToStr1, String compareToStr2) {
        Set<Character> str1Set = createCharacterSet(compareToStr1);
        Set<Character> str2Set = createCharacterSet(compareToStr2);

        if(str1Set.containsAll(str2Set)) {
            return 40.0;
        }
        return 0.0;
    }
}
