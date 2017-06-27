package mashen.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import mashen.model.User;
import mashen.service.UserService;

@Controller
// @RequestMapping("user")
public class UserAction {
	@Resource(name = "userService")
	private UserService us;

	@RequestMapping("/login")
	public String add() {
		User user = new User();
		user.setName("cc");
		user.setPw("11");
		us.add(user);
		return "index";
	}
}
