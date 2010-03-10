package org.codehaus.janino;

/**
 * All Janino components that throw {@link RuntimeException} throw this subclass 
 * to allow for client libraries to intercept them more easily. 
 */
public class JaninoRuntimeException extends RuntimeException {
    public JaninoRuntimeException()               {                 }
    public JaninoRuntimeException(String message) { super(message); }
}