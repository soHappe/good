package com.example.springboot_test_quick;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 保存user
     * @param user
     * @return
     */
    @PostMapping("/saveUser")
    public Result saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    /**
     * 查询所有user
     * @return
     */
    @GetMapping("/queryAll")
    public Result queryAll(){
        return userService.queryAll();
    }

    /**
     * 通过name和age查询
     * @param name
     * @param age
     * @return
     */
    @GetMapping("/getByNameAndAge")
    public Result getByNameAndAge(String name,int age){
        return userService.getByNameAndAge(name,age);
    }
}


