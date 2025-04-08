//Custom exception class that uses the existing Exception with java
public class stackexception extends Exception{
    public stackexception(String error_msg){
        //Prints out the exception
        //Change code in main to allow catch or the throw new <exception> to occur
        super(error_msg);
    }
}
