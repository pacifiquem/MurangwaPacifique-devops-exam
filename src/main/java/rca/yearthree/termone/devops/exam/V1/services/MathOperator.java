package rca.yearthree.termone.devops.exam.V1.services;

import rca.yearthree.termone.devops.exam.V1.exceptions.InvalidOperationException;

public interface MathOperator {
    double doMath(double operand1, double operand2, String operation) throws InvalidOperationException;
}