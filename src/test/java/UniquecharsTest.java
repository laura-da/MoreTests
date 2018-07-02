import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;



public class UniquecharsTest {
    @Test
    public void hasUniqueChars()  {
        assertEquals(2, 1 + 1);
        assertEquals(new String("abc").length(), 3);
        assertTrue(new UniqueChars("abcs").isUniqueSequence()==true );
        assertTrue(new UniqueChars("abcas").isUniqueSequence()==false );

    }
}
