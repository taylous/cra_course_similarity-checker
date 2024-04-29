import cores.LetterCount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterCountTest {

    @Test
    void 기본_생성자_테스트() {
        LetterCount letterCount = new LetterCount();
        assertNotNull(letterCount);
    }

    @Test
    void 비교할_문자열_2개_입력_테스트() {
        LetterCount letterCount = new LetterCount("abc", "def");

        String expected1 = "abc";
        String expected2 = "def";

        assertEquals(expected1, letterCount.getStringToCompare1());
        assertEquals(expected2, letterCount.getStringToCompare2());
    }
}