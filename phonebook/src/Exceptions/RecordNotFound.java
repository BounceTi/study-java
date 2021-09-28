package Exceptions;

public class RecordNotFound extends Exception{

    public RecordNotFound() {
    }

    @Override
    public String getMessage() {
        return "Record not found";
    }
}
