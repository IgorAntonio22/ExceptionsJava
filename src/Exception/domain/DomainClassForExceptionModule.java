package Exception.domain;

public class DomainClassForExceptionModule {

	  public static void main(String[] args) {
	        
		  Conta c = new Conta();
		  
		  try {
			  c.deposita(2);
			  
		  } catch(Exception ex) {
			  ex.printStackTrace();
		  }
		  
		//c.deposita(0); //method in which the custom error extends from Exception
		//force the insertion of throws in the class (force treatment)
		  
		//Exception must be treated or propagated by methods.
		  
		//Exception should be used to errors that the user can correct or that can be
		//treated in a specific way.
		  
		
		  
		  
	  }
}
