package rca.yearthree.termone.devops.exam.V1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import rca.yearthree.termone.devops.exam.V1.dto.DoMathRequest;
import rca.yearthree.termone.devops.exam.V1.exceptions.InvalidOperationException;
import rca.yearthree.termone.devops.exam.V1.services.MathOperator;
import rca.yearthree.termone.devops.exam.V1.utils.NotFound;

import java.util.List;

@RestController
public class MathController {

    private final MathOperator mathOperator;

    @Autowired
    public MathController(MathOperator mathOperator) {
        this.mathOperator = mathOperator;
    }

    @PostMapping("/doMath")
    public ResponseEntity<Double> doMath(@RequestBody DoMathRequest doMathRequest) {
        try {
            double result = mathOperator.doMath(doMathRequest.getOperand1(), doMathRequest.getOperand2(), doMathRequest.getOperation());
            return ResponseEntity.ok(result);
        } catch (InvalidOperationException e) {
            return ResponseEntity.badRequest().body(null);
        }
    }

    @GetMapping("*")
    public ResponseEntity<String> notFound() {
        List<String> availablePaths = List.of("/doMath");
        NotFound notFoundResponse = new NotFound("Not found", availablePaths);
        return ResponseEntity.status(404).body(notFoundResponse.toString());
    }
}
