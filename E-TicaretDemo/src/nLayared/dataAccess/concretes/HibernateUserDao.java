package nLayared.dataAccess.concretes;

import nLayared.business.abstracts.ValidationService;
import nLayared.dataAccess.abstracts.UserDao;
import nLayared.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	ValidationService validationManager;


	
	
	public HibernateUserDao(ValidationService validationManager) {
		super();
		this.validationManager = validationManager;
	}

	@Override
	public boolean add(User user) {
		if(!validationManager.validateName(user.getFirstName())) {
			System.out.println("Kullan�c� iki karakterden fazla olmal�!");
			return false;

		}else if(!validationManager.validateLastName(user.getLastName())) {
			System.out.println("Kullan�c� soyad� iki karakterden fazla olmal�!");
			return false;

		}else if(!validationManager.validateMailAdress(user.getEmail())) {
			System.out.println("Kullan�c� maili ge�ersiz!");
			return false;

		}
		else if(validationManager.validateIsClicked(!user.isClicked())) {
			System.out.println("Kullan�c� do�rulama linkine t�klamad�!");
			return false;
		}
		else {
			System.out.println("Veri taban�na eklendi:" +user.getFirstName());
			return true;
		}
	}

	@Override
	public void update(User user) {
System.out.println("G�ncelleme i�lemi ba�ar�l�:"+user.getFirstName());

	}

	@Override
	public void delete(User user) {
System.out.println("Silme i�lemi ba�ar�l�:" +user.getFirstName());		
	}

}
