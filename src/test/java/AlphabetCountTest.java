import cores.AlphabetCount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class AlphabetCountTest {

    private AlphabetCount alphabetCount;

    @BeforeEach
    void setUp() {
        this.alphabetCount = new AlphabetCount();
    }

    @Test
    void 기본_생성자_테스트() {
        assertNotNull(alphabetCount);
    }

    @Test
    void 같은_종류의_알파벳만_사용() {
        double actual = this.alphabetCount.checkUsedAlphabet("ASD", "DSA");
        double expected = 40.0;

        assertThat(actual).isEqualTo(expected);
    }
}
