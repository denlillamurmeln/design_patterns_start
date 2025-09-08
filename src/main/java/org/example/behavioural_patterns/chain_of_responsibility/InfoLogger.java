package org.example.behavioural_patterns.chain_of_responsibility;

public class InfoLogger extends RequestHandler{
    @Override
    public void handleRequest(Request request) {
        if (request.isInfoLogger()) {
            System.out.println("Detta är ett ERROR meddelande");
            super.handleRequest(request);
        } else {
            nextHandler.handleRequest(request);
        }
    }







//    public void log(String message) {
//        System.out.println("INFO: " + message);
//    }
}
