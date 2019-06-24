package com.example.lookbilibili.controller;

import com.example.lookbilibili.domain.SysUser;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @Description TODO
 * @Auther CB
 * @Date 2019-06-20 19:01
 * @Version 1.0
 **/

@RestController
@RequestMapping("/user")
public class UserController {

    // 创建线程安全的Map
    static Map<Long, SysUser> users = Collections.synchronizedMap(new HashMap<Long, SysUser>());

    @RequestMapping(value="/", method=RequestMethod.GET)
    public List<SysUser> getUserList() {
        // 处理"/users/"的GET请求，用来获取用户列表
        // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
        List<SysUser> r = new ArrayList<SysUser>(users.values());
        return r;
    }

    @RequestMapping(value="/", method=RequestMethod.POST)
    public String postUser(@ModelAttribute SysUser user) {
        // 处理"/users/"的POST请求，用来创建User
        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
        users.put(user.getId(), user);
        return "success";
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public SysUser getUser(@PathVariable Long id) {
        // 处理"/users/{id}"的GET请求，用来获取url中id值的User信息
        // url中的id可通过@PathVariable绑定到函数的参数中
        return users.get(id);
    }

    @RequestMapping(value="/{id}", method= RequestMethod.PUT)
    public String putUser(@PathVariable Long id, @ModelAttribute SysUser user) {
        // 处理"/users/{id}"的PUT请求，用来更新User信息
        SysUser u = users.get(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        users.put(id, u);
        return "success";
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id) {
        // 处理"/users/{id}"的DELETE请求，用来删除User
        users.remove(id);
        return "success";
    }

}
