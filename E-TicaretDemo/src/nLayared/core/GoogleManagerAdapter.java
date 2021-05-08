package nLayared.core;

import nLayared.Google.GoogleManager;
import nLayared.business.concretes.UserManager;
import nLayared.dataAccess.abstracts.UserDao;
import nLayared.entities.concretes.User;

public class GoogleManagerAdapter extends UserManager {

	public GoogleManagerAdapter(User user, UserDao hibernateUserDao) {
		super(user, hibernateUserDao);
		// TODO Auto-generated constructor stub
	}

	GoogleManager googleManager = new GoogleManager();

	
	@Override
	public void login(String mailAdress, String password) {
		
		if(HibernateUserDao.add(user)) {
			googleManager.login(mailAdress, password);
		}
		else {
			System.out.println("Sistemde böyle bir google hesabý yok!");
		}
		
		
	}
}
