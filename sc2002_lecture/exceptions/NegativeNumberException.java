package sc2002_lecture.exceptions;

public class NegativeNumberException extends Exception {
    public NegativeNumberException() {
        super("Negative Number Exception!");
    }

    public NegativeNumberException(String message) {
        super(message);
    }
}