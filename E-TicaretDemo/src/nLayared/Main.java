package nLayared;

import nLayared.business.abstracts.UserService;
import nLayared.business.abstracts.ValidationService;
import nLayared.business.concretes.UserManager;
import nLayared.business.concretes.ValidationManager;
import nLayared.core.GoogleManagerAdapter;
import nLayared.dataAccess.abstracts.UserDao;
import nLayared.dataAccess.concretes.HibernateUserDao;
import nLayared.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		
		User sema=new User("Sema","Kaya","234567","semabayri00@gmail.com",true);
		ValidationService validationManager=new ValidationManager();
		UserDao hibernateUserDao=new HibernateUserDao(validationManager);
		
		UserService userService=new UserManager(sema,hibernateUserDao);
		
		userService.login("semabayri00@gmail.com", "234567");
		
		User batu=new User("Batu","Kaya","123456tg","batu@gmail.com",true);
		UserService usergoogle=new GoogleManagerAdapter(batu,hibernateUserDao);
		usergoogle.login("batu@gmail.com", "123456tg");
		
	}

}
