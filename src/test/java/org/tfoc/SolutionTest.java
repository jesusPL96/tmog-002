package org.tfoc;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class SolutionTest {


    @Test
    void validStringSolution() {

        String s = "((){()}){}[[(){}]]";

        var result = Solution.isValid(s);

        assertTrue(result);

    }
    @Test
    void invalidStringSolution() {

        String s = "(()()){})";

        var result = Solution.isValid(s);

        assertFalse(result);

    }

    @Test
    void invalidStringParenthesisSolution() {

        String s = ")";

        var result = Solution.isValid(s);

        assertFalse(result);

    }

    @Test
    void invalidStringKeySolution() {

        String s = "}";

        var result = Solution.isValid(s);

        assertFalse(result);

    }

    @Test
    void invalidStringBracketSolution() {

        String s = "]";

        var result = Solution.isValid(s);

        assertFalse(result);

    }

    @Test
    void invalidStringDifferentFromParenthesisSolution() {

        String s = "{)";

        var result = Solution.isValid(s);

        assertFalse(result);

    }

    @Test
    void invalidStringDifferentFromKeySolution() {

        String s = "(}";

        var result = Solution.isValid(s);

        assertFalse(result);

    }

    @Test
    void invalidStringDifferentFromBracketSolution() {

        String s = "(]";

        var result = Solution.isValid(s);

        assertFalse(result);

    }

    @Test
    void emptyStringSolution() {

        String s = "";

        var result = Solution.isValid(s);

        assertFalse(result);

    }





}