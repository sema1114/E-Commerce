package nLayared.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import nLayared.business.abstracts.ValidationService;

public class ValidationManager implements ValidationService {

	
	boolean value =true;
	
	@Override
	public boolean validateName(String name) {
		if(name.length()<2) {
			return false;
		}
		else {
			return value;

		}
	}

	@Override
	public boolean validateLastName(String lastname) {

		if(lastname.length()<2) {
			return false;
		}
		else {
			return value;

		}
	}

	@Override
	public boolean validateMailAdress(String mailAdress) {
		String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern emailPath = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
		Matcher matcher = emailPath.matcher(mailAdress);
		return matcher.find();


	}

	@Override
	public boolean validatePassword(String password) {
       if(password.length()<6) {
    	   return false;
       }else {
    	   return value;
       }
	}

	@Override
	public boolean validateIsClicked(boolean isClicked) {
		return isClicked;
	}

}
