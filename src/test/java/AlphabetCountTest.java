import cores.AlphabetCount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class AlphabetCountTest {

    private AlphabetCount alphabetCount;

    private void createInstance(String str1, String str2) {
        if(str1 == null || str2 == null) {
            this.alphabetCount = new AlphabetCount();
            return;
        }
        this.alphabetCount = new AlphabetCount(str1, str2);
    }

    @Test
    void 기본_생성자_테스트() {
        createInstance(null, null);

        assertNotNull(alphabetCount);
    }

    @Test
    void 비교_문자열_입력_테스트() {
        createInstance("ASD", "DSA");

        assertThat(alphabetCount.getCompareToStr1()).isEqualTo("ASD");
        assertThat(alphabetCount.getCompareToStr2()).isEqualTo("DSA");
    }

    @Test
    void 같은_종류의_알파벳만_사용() {
        createInstance("ASD", "DSA");

        double actual = this.alphabetCount.checkUsedAlphabet();
        double expected = 40.0;

        assertThat(actual).isEqualTo(expected);
    }
}
