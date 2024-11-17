package org.grishin.patch;

public class SparkPatchException extends RuntimeException {

    public SparkPatchException(Exception cause) {
        super(cause);
    }

    public SparkPatchException(String message) {
        super(message);
    }
}
