package org.example.behavioural_patterns.chain_of_responsibility;

public class RequestProcessor {
    private RequestHandler chain;

    public RequestProcessor() {
        // Create handlers
        RequestHandler errorHandler = new ErrorLogger();
        RequestHandler debugHandler = new DebugLogger();
        RequestHandler infoHandler = new InfoLogger();

        // Set up the chain
        errorHandler.setNext(debugHandler);
        debugHandler.setNext(infoHandler);

        this.chain = errorHandler; // Start of the chain
    }

    public void processRequest(Request request) {
        chain.handleRequest(request);
    }
}
