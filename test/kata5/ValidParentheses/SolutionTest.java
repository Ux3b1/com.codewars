package kata5.ValidParentheses;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void sampleTest() {
//        assertEquals("expected", "actual");
        assertEquals(true,Solution.validParentheses( "()" ));
        assertEquals(false,Solution.validParentheses( "())" ));
        assertEquals(true,Solution.validParentheses( "32423(sgsdg)" ));
        assertEquals(false,Solution.validParentheses( "(dsgdsg))2432" ));
        assertEquals(true,Solution.validParentheses( "adasdasfa" ));
        assertEquals(true,Solution.validParentheses( "po(((.((O)7)wSqiZ@R)VPk)LI|ZAvU)J}h2" ));
    }
}