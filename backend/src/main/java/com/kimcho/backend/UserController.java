package com.kimcho.backend;

import com.kimcho.backend.User;
import com.kimcho.backend.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @GetMapping("/user")
    public List<User> userApi() {

        return userService.getUserApi();
    }
    
	//해당url 경로에 form양식의 데이터를 보내면 매개변수 user에 담아온다.
    @PostMapping("/user/create")
    public String createUserPro(User user) {
        userService.createUser(user);
		
        //post를 하고난 뒤 표시할 url
        //리액트의 서버 포트가 3000을 사용하므로 localhost:3000
        return "redirect:http://localhost:3000/";
    }
    
    //삭제
    @GetMapping("/user/delete")
    public String userDeletePro(@RequestParam(value="id") Integer id) {
    	System.out.println("Hello, world");
        userService.userDelete(id);

        return "redirect:http://localhost:3000/";
    }
    
    //수정
    @PostMapping("/user/update")
    public String userUpdatePro(@RequestParam(value="id") Integer id, User user) {
        User userTemp = userService.userDetail(id);
        userTemp.setIntroduce(user.getIntroduce());

        userService.createUser(userTemp);
        return "redirect:http://localhost:3000/";
    }
}