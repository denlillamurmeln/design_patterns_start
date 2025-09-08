package org.example.behavioural_patterns.chain_of_responsibility;

public abstract class RequestHandler {
    protected RequestHandler nextHandler;

    public void setNext(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(Request request) {
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
