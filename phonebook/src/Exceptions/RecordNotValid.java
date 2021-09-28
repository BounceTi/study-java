package Exceptions;

public class RecordNotValid extends Exception{

    public RecordNotValid() {
    }

    @Override
    public String getMessage() {
        return "Record not valid";
    }

}
