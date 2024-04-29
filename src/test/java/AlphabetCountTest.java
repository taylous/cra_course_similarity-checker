import cores.AlphabetCount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlphabetCountTest {

    @Test
    void 기본_생성자_테스트() {
        AlphabetCount alphabetCount = new AlphabetCount();

        assertNotNull(alphabetCount);
    }
}