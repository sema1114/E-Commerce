package nLayared.business.abstracts;

public interface UserService {

	void login(String password,String mailAddress);
	void changePassword(String password);
	void changeMailAdress(String mailAdress);
}
