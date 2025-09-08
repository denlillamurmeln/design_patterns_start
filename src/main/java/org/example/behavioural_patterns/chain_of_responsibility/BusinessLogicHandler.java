package org.example.behavioural_patterns.chain_of_responsibility;

public class BusinessLogicHandler extends RequestHandler {
    @Override
    public void handleRequest(Request request) {
        if (request.isValid()) {
            System.out.println("Processing business logic...");
            // Perform the main business logic here
            super.handleRequest(request);
        } else {
            System.out.println("Request is invalid. Cannot process business logic.");
        }
    }
}
