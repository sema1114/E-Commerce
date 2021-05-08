package nLayared.business.abstracts;

public interface ValidationService {
 boolean validateName(String name);
 boolean validateLastName(String lastname);
 boolean validateMailAdress(String mailAdress);
 boolean validatePassword(String password);
 boolean validateIsClicked(boolean isClicked);
}
