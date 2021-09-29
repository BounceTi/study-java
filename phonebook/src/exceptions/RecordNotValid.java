package exceptions;

public class RecordNotValid extends Exception {

    @Override
    public String getMessage() {
        return "Name or phone number is empty";
    }

}
