package exceptions;

public class PhoneNumberAlreadyExists extends Exception {

    private String phoneNumber;

    public PhoneNumberAlreadyExists(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getMessage() {
        return phoneNumber + " Phone number already exists";
    }
}
