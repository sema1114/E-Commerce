package nLayared.Google;

public class GoogleManager {

	private String googleMail="semagoogle@gmail.com";
	private String googlePassword="139876sd";
	
	
	public void login(String mailAdress,String Password) {
		if(!googleMail.equals(mailAdress)) {
			System.out.println("Google mail yanlýþ");
		}else if(!googlePassword.equals(Password)) {
			System.out.println("Google þifresi yanlýþ!");
		}
		else if(!googleMail.equals(mailAdress)&&!googlePassword.equals(Password)) {
			System.out.println("Google þifresi ve mail adresi yanlýþ!");

		}else {
			System.out.println("Google kullanýcýsý giriþi baþarýlý.");
		}
	}
}
