
public class InvalidAgeException extends RuntimeException
{

	private static final long serialVersionUID = 1L;
	String msg="invalid age, minimum age must be greater than 18";
	@Override
	public String toString() {
		return msg;
	}
	public String getMsg() {
		return msg;
	}
}
