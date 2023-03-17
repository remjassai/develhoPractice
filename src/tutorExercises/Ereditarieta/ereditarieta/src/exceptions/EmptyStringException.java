package tutorExercises.Ereditarieta.ereditarieta.src.exceptions;

public class EmptyStringException extends Exception {

    private String message;

    public EmptyStringException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
