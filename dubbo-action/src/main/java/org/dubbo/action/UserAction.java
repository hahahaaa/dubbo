package org.dubbo.action;

import javax.servlet.http.HttpServletRequest;

import org.dubbo.api.service.UserService;
import org.dubbo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Scope("prototype")
@RequestMapping(value = "/wx")
public class UserAction {

	@Autowired
	public UserService userService;

	@RequestMapping(value = "/listUser", method = RequestMethod.GET)
	@ResponseBody
	public String listUser(HttpServletRequest request) {
		User u = userService.findById(1);
		return "dsf";
	}
}
