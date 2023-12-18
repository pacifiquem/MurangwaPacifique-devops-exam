package rca.yearthree.termone.devops.exam.V1.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoMathRequest {
    private double operand1;
    private double operand2;
    private String operation;

    public DoMathRequest() {
    }

    public DoMathRequest(double operand1, double operand2, String operation) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;
    }

    // toString method for easy debugging
    @Override
    public String toString() {
        return "DoMathRequest{" +
                "operand1=" + operand1 +
                ", operand2=" + operand2 +
                ", operation='" + operation + '\'' +
                '}';
    }
}
