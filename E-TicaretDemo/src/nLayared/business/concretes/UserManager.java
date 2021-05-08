package nLayared.business.concretes;

import nLayared.business.abstracts.UserService;
import nLayared.dataAccess.abstracts.UserDao;
import nLayared.entities.concretes.User;

public class UserManager implements UserService {

	
	protected User user;
	protected UserDao HibernateUserDao;
	
	public UserManager(User user, UserDao hibernateUserDao) {
		super();
		this.user = user;
		HibernateUserDao = hibernateUserDao;
	}



	@Override
	public void login(String password, String mailAddress) {
		if(HibernateUserDao.add(user)) {
			if(password.equals(user.getPassword()) && mailAddress.equals(user.getEmail())) {
				System.out.println("Kullan�c� kayd� ba�ar�l�.");
			}
			else if(!password.equals(user.getPassword()) && !mailAddress.equals(user.getEmail())) {
				System.out.println("Mail adresi ve �ifre yanl�� girildi!");
			}
			else if(!password.equals(user.getPassword())){
				System.out.println("�ifre yanl�� girildi!");
			}
			else if(!mailAddress.equals(user.getEmail())){
				System.out.println("Mail adresi yanl�� girildi!");
			}
		}
		else {
			System.out.println("Sistemde b�yle bir kullan�c� yok!");
		}
	}

	

	@Override
	public void changePassword(String password) {
       if(password.equals(user.getPassword())) {
    	   HibernateUserDao.update(user);
       }
	}

	@Override
	public void changeMailAdress(String mailAdress) {
		if(mailAdress.equals(user.getEmail())) {
			HibernateUserDao.update(user);
		}		
	}

}
