package jspidersApp.Email;

public interface EmailApi 
{
	public void receiveMail();
	void sendMail(String from, String password, String to, String sub, String msg);
}
