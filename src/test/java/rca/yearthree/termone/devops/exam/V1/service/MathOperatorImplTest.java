package rca.yearthree.termone.devops.exam.V1.service;

import org.junit.jupiter.api.Test;
import rca.yearthree.termone.devops.exam.V1.exceptions.InvalidOperationException;
import rca.yearthree.termone.devops.exam.V1.services.MathOperator;
import rca.yearthree.termone.devops.exam.V1.services.impl.MathOperatorImpl;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathOperatorImplTest {

    private final MathOperator mathOperator = new MathOperatorImpl();

    @Test
    void testAddition() throws InvalidOperationException {
        double result = mathOperator.doMath(3.0, 4.0, "+");
        assertEquals(7.0, result);
    }

    @Test
    void testSubtraction() throws InvalidOperationException {
        double result = mathOperator.doMath(8.0, 3.0, "-");
        assertEquals(5.0, result);
    }

    @Test
    void testMultiplication() throws InvalidOperationException {
        double result = mathOperator.doMath(5.0, 2.0, "*");
        assertEquals(10.0, result);
    }

    @Test
    void testDivision() throws InvalidOperationException {
        double result = mathOperator.doMath(10.0, 2.0, "/");
        assertEquals(5.0, result);
    }

    @Test
    void testDivisionByZero() {
        assertThrows(InvalidOperationException.class, () -> mathOperator.doMath(5.0, 0.0, "/"));
    }

    @Test
    void testUnknownOperation() {
        assertThrows(RuntimeException.class, () -> mathOperator.doMath(3.0, 4.0, "%"));
    }
}
