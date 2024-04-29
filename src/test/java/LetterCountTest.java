import cores.LetterCount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterCountTest {

    @Test
    void create_letter_count_constructor() {
        LetterCount letterCount = new LetterCount();
        assertNotNull(letterCount);
    }
}