import cores.LetterCount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterCountTest {

    private LetterCount letterCount;
    
    private double createConstructorWithCompareStrings(String str1, String str2) {
        this.letterCount = new LetterCount(str1, str2);
        return this.letterCount.processCompare();
    }

    @Test
    void 기본_생성자_테스트() {
        createConstructorWithCompareStrings("", "");
        assertNotNull(letterCount);
    }

    @Test
    void 비교할_문자열_2개_입력_테스트() {
        createConstructorWithCompareStrings("abc", "def");

        String expected1 = "abc";
        String expected2 = "def";

        assertEquals(expected1, letterCount.getStringToCompare1());
        assertEquals(expected2, letterCount.getStringToCompare2());
    }

    @Test
    void 같은_글자수_로직() {
        double actual = createConstructorWithCompareStrings("abc", "def");
        double expected = LetterCount.MAX_SCORE;

        assertEquals(expected, actual);
    }

    @Test
    void 길이가_2배이상_차이난다면() {
        double actual = createConstructorWithCompareStrings("a", "aaa");
        double actual2 = createConstructorWithCompareStrings("a", "aa");
        double expected = LetterCount.MIN_SCORE;

        assertEquals(expected, actual);
        assertEquals(expected, actual2);
    }

    @Test
    void 부분점수_로직() {
        double actual = createConstructorWithCompareStrings("apple", "banana");
        double actual2 = createConstructorWithCompareStrings("banana2", "apple");
        double expected = 48.0;
        double expected2 = 36.0;

        assertEquals(expected, actual);
        assertEquals(expected2, actual2);
    }
}