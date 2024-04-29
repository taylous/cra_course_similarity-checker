package cores;

import java.util.Set;
import java.util.stream.Collectors;

public class AlphabetCount {

    private final String str1;
    private final String str2;

    public AlphabetCount(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    public AlphabetCount() {
        this("", "");
    }

    public String getCompareToStr1() {
        return str1;
    }

    public String getCompareToStr2() {
        return str2;
    }

    public double checkUsedAlphabet() {
        Set<Character> str1Set = this.str1.chars().mapToObj(ch -> (char) ch).collect(Collectors.toSet());
        Set<Character> str2Set = this.str1.chars().mapToObj(ch -> (char) ch).collect(Collectors.toSet());

        if(str1Set.containsAll(str2Set)) {
            return 40.0;
        }
        return 0.0;
    }
}
