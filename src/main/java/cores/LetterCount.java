package cores;

import java.lang.reflect.Constructor;

public class LetterCount {

    private final String compareToStr1;
    private final String compareToStr2;

    public LetterCount(String compareToStr1, String compareToStr2) {
        this.compareToStr1 = compareToStr1;
        this.compareToStr2 = compareToStr2;
    }

    public LetterCount() {
        this("", "");
    }

    public String getStringToCompare1() {
        return this.compareToStr1;
    }

    public String getStringToCompare2() {
        return this.compareToStr2;
    }
}
