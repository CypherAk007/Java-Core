package Exceptions.O2_CustomException;

public class NullValuesNotAllowedException extends RuntimeException{
    public NullValuesNotAllowedException(){
        super("Null value not allowed!!.");
    }

    public NullValuesNotAllowedException(String message){
        super(message);
    }
}
