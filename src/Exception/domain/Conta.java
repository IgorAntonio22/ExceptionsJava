package Exception.domain;

import Exception.ExceptionExceptionModule;
import Exception.RuntimeExceptionModule;

public class Conta {
	public int deposita(int i) throws ExceptionExceptionModule { //checked (extends Exception)
		//force the insertion of throws in the class (force treatment)
		if(i < 400) {
			throw new ExceptionExceptionModule("O valor precisa se maior que 400");
		}
		return 500;
	}
	
	public int saca(int i) { //unchecked (extends RuntimeException)
//doesn't force treatment of the exception, doesn't need to put throws
//at the class signature or even a try/catch block encapsulating the code in the loader class
		if (i < 500) {
			throw new RuntimeExceptionModule("O valor precisa ser maior que 500");
		}
		return 600;
	}
}
