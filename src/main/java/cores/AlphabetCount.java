package cores;

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
}
