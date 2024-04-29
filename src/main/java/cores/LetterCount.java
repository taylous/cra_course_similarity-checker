package cores;

import java.lang.reflect.Constructor;

public class LetterCount {

    public static final double MAX_SCORE = 60.0;

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

    public double processCompare() {
        if(this.compareToStr1.length() == this.compareToStr2.length()) {
            return MAX_SCORE;
        }
        return 0;
    }
}
