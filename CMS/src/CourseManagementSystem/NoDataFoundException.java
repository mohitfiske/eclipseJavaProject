package CourseManagementSystem;

public class NoDataFoundException extends Exception{
	private String invalidName;
	
	public NoDataFoundException(String errMsg,String name) {
		super(errMsg);
		this.invalidName = name;
	}
	
	@Override
	public String getMessage() {
		String message = super.getMessage();
		String finalMessage = message +"----->"+invalidName;
		return finalMessage;
	}
}
