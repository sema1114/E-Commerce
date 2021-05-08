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
				System.out.println("Kullanýcý kaydý baþarýlý.");
			}
			else if(!password.equals(user.getPassword()) && !mailAddress.equals(user.getEmail())) {
				System.out.println("Mail adresi ve þifre yanlýþ girildi!");
			}
			else if(!password.equals(user.getPassword())){
				System.out.println("Þifre yanlýþ girildi!");
			}
			else if(!mailAddress.equals(user.getEmail())){
				System.out.println("Mail adresi yanlýþ girildi!");
			}
		}
		else {
			System.out.println("Sistemde böyle bir kullanýcý yok!");
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
