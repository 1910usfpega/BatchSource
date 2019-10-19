package yourworkhere;

//runtime exception is a superClass which are never checked or
//caught after being thrown in execution
public class OverDraftException extends RuntimeException {
	
	@Override
	public String getMessage() {
		return "Exception made to withdraw. Balance is now below 0.";
		
	}
	
}
