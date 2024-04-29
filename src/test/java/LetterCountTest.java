import cores.LetterCount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterCountTest {

    private LetterCount letterCount;
    
    private void createConstructorWithCompareStrings(String str1, String str2) {
        this.letterCount = new LetterCount(str1, str2);
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
}