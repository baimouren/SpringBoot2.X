package com.example.lookbilibili.controller.manage.login;

import com.example.lookbilibili.controller.base.BaseController;
import com.example.lookbilibili.service.manage.login.LoginService;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Auther CB
 * @Date 2019-06-25 10:27
 * @Version 1.0
 **/

@Controller
public class LoginController extends BaseController {

    @Autowired
    private LoginService loginService;

    /**
     * 根据配置，Spring Security提供了一个过滤器来拦截请求并验证用户身份。
     * 如果用户身份认证失败，页面就重定向到/login?error，并且页面中会展现相应的错误信息。
     * 若用户想要注销登录，可以通过访问/login?logout请求，在完成注销之后，页面展现相应的成功消息。
     *
     * 到这里，我们启用应用，并访问http://localhost:8080/，可以正常访问。
     * 但是访问http://localhost:8080/hello的时候被重定向到了http://localhost:8080/login页面，因为没有登录，用户没有访问权限，
     * 通过输入用户名user和密码password进行登录后，跳转到了Hello World页面，
     * 再也通过访问http://localhost:8080/login?logout，就可以完成注销操作。
     */
    @RequestMapping("/login")
    public String login() {
        return loginService.login(getString("userName"),getString("userPassword"));
    }


}
