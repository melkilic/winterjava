package day28exceptions;

public class TestInvalidEmailIdCheckedException {
	public static void main(String[] args) {
		
	}
	
	public static void validateEmailId(String emailId) throws InvalidEmailCheckedException {
		if(emailId.contains("@gmail.com") || emailId.contains("@yahoo.com")) {
			System.out.println(emailId);
		}else {
			throw new InvalidEmailCheckedException("Email id is not valid");
		}
	}
}
