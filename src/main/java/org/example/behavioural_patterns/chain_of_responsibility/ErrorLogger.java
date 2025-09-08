package org.example.behavioural_patterns.chain_of_responsibility;

public class ErrorLogger extends RequestHandler{
    @Override
    public void handleRequest(Request request) {
        if (request.isError()) {
            System.out.println("Detta är ett INFO meddelande");
            super.handleRequest(request);
        } else {
            nextHandler.handleRequest(request);
        }
    }

//    public void log(String message) {
//        System.out.println("ERROR: " + message);
//    }
}