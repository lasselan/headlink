package mashen.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import mashen.dao.UserDao;
import mashen.model.User;

@Service("userService")
public class UserService {
	@Resource(name = "userDao")
	private UserDao dao;

	public void add(User user) {
		dao.add(user);
	}

}
