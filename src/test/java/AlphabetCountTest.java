import cores.AlphabetCount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class AlphabetCountTest {

    @Test
    void 기본_생성자_테스트() {
        AlphabetCount alphabetCount = new AlphabetCount();

        assertNotNull(alphabetCount);
    }

    @Test
    void 비교_문자열_입력_테스트() {
        AlphabetCount alphabetCount = new AlphabetCount("ASD", "DSA");

        assertThat(alphabetCount.getCompareToStr1()).isEqualTo("ASD");
        assertThat(alphabetCount.getCompareToStr2()).isEqualTo("DSA");
    }
}
