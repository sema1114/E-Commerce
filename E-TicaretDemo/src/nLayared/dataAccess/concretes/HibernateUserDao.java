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
			System.out.println("Kullanýcý iki karakterden fazla olmalý!");
			return false;

		}else if(!validationManager.validateLastName(user.getLastName())) {
			System.out.println("Kullanýcý soyadý iki karakterden fazla olmalý!");
			return false;

		}else if(!validationManager.validateMailAdress(user.getEmail())) {
			System.out.println("Kullanýcý maili geçersiz!");
			return false;

		}
		else if(validationManager.validateIsClicked(!user.isClicked())) {
			System.out.println("Kullanýcý doðrulama linkine týklamadý!");
			return false;
		}
		else {
			System.out.println("Veri tabanýna eklendi:" +user.getFirstName());
			return true;
		}
	}

	@Override
	public void update(User user) {
System.out.println("Güncelleme iþlemi baþarýlý:"+user.getFirstName());

	}

	@Override
	public void delete(User user) {
System.out.println("Silme iþlemi baþarýlý:" +user.getFirstName());		
	}

}
