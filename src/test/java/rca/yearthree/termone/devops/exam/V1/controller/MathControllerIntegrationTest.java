package rca.yearthree.termone.devops.exam.V1.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.http.MediaType;
import rca.yearthree.termone.devops.exam.V1.dto.DoMathRequest;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class MathControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper; // Autowire ObjectMapper to convert objects to JSON

    @Test
    void testDoMathEndpoint() throws Exception {
        // Input data
        double operand1 = 3.0;
        double operand2 = 4.0;
        String operation = "+";

        // Perform the POST request
        mockMvc.perform(MockMvcRequestBuilders.post("/doMath")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(new DoMathRequest(operand1, operand2, operation))))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isNumber()) // Ensure the response is a number
                .andExpect(jsonPath("$").value(operand1 + operand2)); // Ensure the result is correct
    }
}
