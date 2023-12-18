package rca.yearthree.termone.devops.exam.V1.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import rca.yearthree.termone.devops.exam.V1.dto.DoMathRequest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MathControllerEndToEndTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testDoMathEndpoint() {
        String url = "/doMath";
        DoMathRequest request = new DoMathRequest(3.0, 4.0, "+");
        Double result = restTemplate.postForObject(url, request, Double.class);
        assertEquals(7.0, result);
    }
}