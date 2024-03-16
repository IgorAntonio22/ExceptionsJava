package Exception.domain;

import Exception.ExceptionExceptionModule;
import Exception.RuntimeExceptionModule;

public class DomainClassForRuntimeExceptionModule {

	
	public static void main(String[] args) {
		
       Conta c = new Conta();
       
       c.saca(400);
       
       //doesn't force treatment of the exception, doesn't need to put throws
       //at the class signature or a try/catch block encapsulating the code
       
       //RuntimeExceptions can be ignored (not treated) by methods.
       
       //RuntimeExceptions should be used to errors that the user can't fix and errors that
       //generally indicate a problem in the code.
     
    }
}
	