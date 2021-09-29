package exceptions;

public class RecordNotFound extends RuntimeException {

    private long id;

    public RecordNotFound(long id) {
        this.id = id;
    }

    @Override
    public String getMessage() {
        return "Record with id " + id + " does not exist";
    }
}
