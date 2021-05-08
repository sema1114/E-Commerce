package nLayared.dataAccess.abstracts;

import nLayared.entities.concretes.User;

public interface UserDao {
	boolean add(User user);
	void update(User user);
	void delete(User user);

}
