import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PermStringTest {
    @Test
    public void hasAllPermutations() {
        String abc = "abc";

        List<String> allPermutations = strPermutations.getPermutations(abc);
        assertThat(allPermutations, containsInAnyOrder("abc", "acb", "bac", "bca","cab", "cba"));
        assertTrue("abc".length()==3);
        assertTrue("abc".substring(3).equals(""));
        //assertThat(strPermutations.getPermutations(abc), contains("abc"));
    }
}
