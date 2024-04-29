package cores;

public class AlphabetCount {

    public static final double MAX_SCORE = 40.0;
    public static final int ALPHABET_COUNT = 26;

    public AlphabetCount() {
    }

    private int createStrToBits(String targetStr) {
        int bits = 0;
        char[] chars = targetStr.toCharArray();

        for (char ch : chars) {
            int index = ch - 'A';
            bits |= (1 << index);
        }
        return bits;
    }

    private int checkAlphabetBits(int str1Bits, int str2Bits, boolean isIntersection) {
        int count = 0;
        int str1Bit, str2Bit;

        for (int i = 0; i < ALPHABET_COUNT; i += 1) {
            str1Bit = str1Bits & (1 << i);
            str2Bit = str2Bits & (1 << i);

            if (isIntersection) {
                if (0 < str1Bit && 0 < str2Bit) {
                    count += 1;
                }
            } else {
                if (0 < str1Bit || 0 < str2Bit) {
                    count += 1;
                }
            }

        }
        return count;
    }

    public double checkUsedAlphabet(String compareToStr1, String compareToStr2) {
        int str1Bits = createStrToBits(compareToStr1);
        int str2Bits = createStrToBits(compareToStr2);

        if (str1Bits == str2Bits) {
            return 40.0;
        } else {
            int intersectionCount = checkAlphabetBits(str1Bits, str2Bits, true);

            if (intersectionCount == 0) {
                return 0.0;
            }
            int unionCount = checkAlphabetBits(str1Bits, str2Bits, false);

            return (((double) intersectionCount / unionCount)) * MAX_SCORE;
        }
    }
}
