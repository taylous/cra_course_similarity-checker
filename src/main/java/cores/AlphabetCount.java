package cores;

import java.util.Set;
import java.util.stream.Collectors;

public class AlphabetCount {

    public static final int ALPHABET_COUNT = 26;
    public AlphabetCount() {}

    private int createStrToBits(String targetStr) {
        int bits = 0;
        char[] chars = targetStr.toCharArray();

        for(char ch : chars) {
            int index = ch - 'A';
            bits |= (1 << index);
        }
        return bits;
    }

    private int checkIntersectionAlphabets(int str1Bits, int str2Bits) {
        int intersectionCount = 0;
        int str1Bit, str2Bit;


        for(int i = 0; i < ALPHABET_COUNT; i += 1) {
            str1Bit = str1Bits & (1 << i);
            str2Bit = str2Bits & (1 << i);

            if(0 < str1Bit && 0 < str2Bit) {
                intersectionCount += 1;
            }
        }
        return intersectionCount;
    }

    public double checkUsedAlphabet(String compareToStr1, String compareToStr2) {
       int str1Bits = createStrToBits(compareToStr1);
       int str2Bits = createStrToBits(compareToStr2);

        if(str1Bits == str2Bits) {
            return 40.0;
        }
        else {
            int intersectionCount = checkIntersectionAlphabets(str1Bits, str2Bits);
            if(intersectionCount == 0) {
                return 0.0;
            }
            return 0.0;
        }
    }
}
