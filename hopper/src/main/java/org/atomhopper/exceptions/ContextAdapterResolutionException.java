package org.atomhopper.exceptions;

public class ContextAdapterResolutionException extends RuntimeException {

    public ContextAdapterResolutionException(String message, Throwable cause) {
        super(message, cause);
    }

    public ContextAdapterResolutionException(String message) {
        super(message);
    }
}
