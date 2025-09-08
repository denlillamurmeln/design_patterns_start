package org.example.behavioural_patterns.chain_of_responsibility;

public class RequestProcessor {
    private RequestHandler chain;

    public RequestProcessor() {
        // Create handlers
        RequestHandler errorHandler = new ErrorLogger();
        RequestHandler debugHandler = new DebugLogger();
        RequestHandler infoHandler = new InfoLogger();

//        RequestHandler logicHandler = new BusinessLogicHandler();

        // Set up the chain
        errorHandler.setNext(debugHandler);
        debugHandler.setNext(infoHandler);
//        infoHandler.setNext(logicHandler);

        this.chain = errorHandler; // Start of the chain
    }

    public void processRequest(Request request) {
        chain.handleRequest(request);
    }
}
