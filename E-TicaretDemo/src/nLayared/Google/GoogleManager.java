package nLayared.Google;

public class GoogleManager {

	private String googleMail="semagoogle@gmail.com";
	private String googlePassword="139876sd";
	
	
	public void login(String mailAdress,String Password) {
		if(!googleMail.equals(mailAdress)) {
			System.out.println("Google mail yanl��");
		}else if(!googlePassword.equals(Password)) {
			System.out.println("Google �ifresi yanl��!");
		}
		else if(!googleMail.equals(mailAdress)&&!googlePassword.equals(Password)) {
			System.out.println("Google �ifresi ve mail adresi yanl��!");

		}else {
			System.out.println("Google kullan�c�s� giri�i ba�ar�l�.");
		}
	}
}
