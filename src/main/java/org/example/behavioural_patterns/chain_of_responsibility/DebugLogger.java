package org.example.behavioural_patterns.chain_of_responsibility;


public class DebugLogger extends RequestHandler{
    @Override
    public void handleRequest(Request request) {
        if (request.isDebug()) {
            System.out.println("Detta är ett DEBUG meddelande");
            super.handleRequest(request);
        } else {
            nextHandler.handleRequest(request);
        }
    }


//    public void log(String message) {
//        System.out.println("DEBUG: " + message);
//    }
}