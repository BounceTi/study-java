package exceptions;

public class PhoneNumberAlreadyExists extends Exception {

    public PhoneNumberAlreadyExists() {
    }

    @Override
    public String getMessage() {
        return "Phone number already exists";
    }
}
