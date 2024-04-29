package cores;

public class LetterCount {

    private static class CompareResult {
        public int A;
        public int B;

        public CompareResult(int a, int b) {
            A = a;
            B = b;
        }
    }

    public static final double MAX_SCORE = 60.0;
    public static final double MIN_SCORE = 0.0;

    private final String compareToStr1;
    private final String compareToStr2;

    public LetterCount(String compareToStr1, String compareToStr2) {
        this.compareToStr1 = compareToStr1;
        this.compareToStr2 = compareToStr2;
    }

    public String getStringToCompare1() {
        return this.compareToStr1;
    }

    public String getStringToCompare2() {
        return this.compareToStr2;
    }

    private CompareResult arrangeStrLength(int lengthA, int lengthB) {
        CompareResult compareResult;

        if(lengthA < lengthB) {
            compareResult = new CompareResult(lengthB, lengthA);
        }
        else {
            compareResult = new CompareResult(lengthA, lengthB);
        }
        return compareResult;
    }

    public double processCompare() {
        if(this.compareToStr1.length() == this.compareToStr2.length()) {
            return MAX_SCORE;
        }
        else {
            int str1Length = this.compareToStr1.length();
            int str2Length = this.compareToStr2.length();

            if(str1Length * 2 <= str2Length || str2Length * 2 <= str1Length) {
                return MIN_SCORE;
            }
            else {
                CompareResult compareResult = arrangeStrLength(str1Length, str2Length);

                return (1 - ((double) (compareResult.A - compareResult.B) / compareResult.B))
                        * MAX_SCORE;
            }
        }
    }
}
