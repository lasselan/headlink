package mashen.dao;


import org.springframework.stereotype.Repository;

import mashen.model.User;
@Repository("userDao")
public interface UserDao {
	public void add(User user);

}
