package org.nb.controller;

import org.nb.entity.User;
import org.nb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public String login(User user){
        String msg="";
        User u=userService.login(user);
        if (u!=null){
            msg="true";
        }else {
            msg="false";
        }
        return msg;
    }

}
