package hello;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.lby.entity.User;
import cn.lby.mapper.SimpleUserMapper;
import cn.lby.mapper.UserMapper;

@RestController
@MapperScan("cn.lby.mapper")
public class UserController {

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private SimpleUserMapper simpleUserMapper;
	
	@RequestMapping(value = "/rest/newUser", method=RequestMethod.POST)
	public String addUser(String name, String email) {
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		int isInsert = userMapper.insertUser(user);
		if (isInsert == 1) {
			return "success";
		} else {
			return "false";
		}
	}
	
//	@RequestMapping(value = "/rest/users")
//	public List<User> users() {
//		return userMapper.findAllUsers();
//	}
//
//	@RequestMapping(value = "/rest/users/{id}")
//	public User user(@PathVariable int id) {
//		return userMapper.findUserById(id);
//	}

//	@RequestMapping(value = "/rest/newUser", method=RequestMethod.POST)
//	public String addUser(String name, String email) {
//		User user = new User();
//		user.setName(name);
//		user.setEmail(email);
//		simpleUserMapper.insertUser(user);
//		return "success";
//	}
	
	@RequestMapping(value = "/rest/users")
	public List<User> users() {
		return simpleUserMapper.findAllUsers();
	}
	
	// 注意加 @PathVariable
	@RequestMapping(value = "/rest/users/{id}")
	public User user(@PathVariable int id) {
		return simpleUserMapper.findUserById(id);
	}


}
