package org.example.behavioural_patterns.chain_of_responsibility;

public class Request {
    private boolean debug;
    private boolean error;
    private boolean infoLogger;
    private boolean valid = true;

    public Request(boolean debug, boolean error, boolean infoLogger) {
        this.debug = debug;
        this.error = error;
        this.infoLogger = infoLogger;
    }

    public boolean isDebug() {
        return debug;
    }

    public boolean isError() {
        return error;
    }

    public boolean isInfoLogger() {
        return infoLogger;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
}
