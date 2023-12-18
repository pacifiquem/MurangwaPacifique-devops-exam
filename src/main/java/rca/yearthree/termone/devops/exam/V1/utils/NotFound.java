package rca.yearthree.termone.devops.exam.V1.utils;

import org.springframework.http.HttpStatus;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NotFound {

    private final String notFoundRoute;
    private final List<String> availablePaths;

    public NotFound(String notFoundRoute, List<String> availablePaths) {
        this.notFoundRoute = notFoundRoute;
        this.availablePaths = availablePaths;
    }

    public String getNotFoundRoute() {
        return notFoundRoute;
    }

    public List<String> getAvailablePaths() {
        return availablePaths;
    }

    @Override
    public String toString() {
        String availablePathsString = availablePaths.stream().collect(Collectors.joining(", "));
        return "Route '" + notFoundRoute + "' not found. Available paths: " + availablePathsString + ". Usage: " + constructUsageString();
    }

    private String constructUsageString() {
        return "To use the available paths, make a POST request to the following endpoints with a JSON body containing 'operand1', 'operand2', and 'operation':\n" +
                "1. /doMath";
    }
}
