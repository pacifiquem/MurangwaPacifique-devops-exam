package rca.yearthree.termone.devops.exam.V1.services.impl;

import org.springframework.stereotype.Service;
import rca.yearthree.termone.devops.exam.V1.exceptions.InvalidOperationException;
import rca.yearthree.termone.devops.exam.V1.services.MathOperator;

@Service
public class MathOperatorImpl implements MathOperator {

    @Override
    public double doMath(double operand1, double operand2, String operation) throws InvalidOperationException {
        switch (operation) {
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    throw new InvalidOperationException("Cannot divide by 0");
                }
                return operand1 / operand2;
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            default:
                throw new RuntimeException("Unknown operation");
        }
    }
}