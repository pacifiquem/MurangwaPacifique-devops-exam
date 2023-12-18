package rca.yearthree.termone.devops.exam.V1.utils;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotFoundTest {

    @Test
    void testNotFoundToString() {
        String notFoundRoute = "exampleRoute";
        List<String> availablePaths = Arrays.asList("/doMath", "/otherEndpoint");

        NotFound notFound = new NotFound(notFoundRoute, availablePaths);

        String expectedMessage = "Route 'exampleRoute' not found. Available paths: /doMath, /otherEndpoint. Usage: To use the available paths, make a POST request to the following endpoints with a JSON body containing 'operand1', 'operand2', and 'operation':\n1. /doMath";
        assertEquals(expectedMessage, notFound.toString());
    }
}
