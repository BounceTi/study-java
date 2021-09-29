package exceptions;

public class RecordNotValid extends Exception{

    public RecordNotValid() {
    }

    @Override
    public String getMessage() {
        return "Main.Record not valid";
    }

}
