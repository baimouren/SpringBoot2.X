package com.example.lookbilibili.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * @Description TODO
 * @Auther CB
 * @Date 2019-06-21 11:26
 * @Version 1.0
 **/
//@Configuration
//@EnableWebSecurity
public class WebSecurityConfig  /*extends WebSecurityConfigurerAdapter*/{


    /**
     *     作者：乾源
     *     来源：CSDN
     *     原文：https://blog.csdn.net/u014553029/article/details/86690622
     */

//    @Resource
//    private UserService userService;
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userService).passwordEncoder(new BCryptPasswordEncoder());
//    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        //允许基于HttpServletRequest使用限制访问
//        http.authorizeRequests()
//                //不需要身份认证
//                .antMatchers("/", "/home","/toLogin","/**/customer/**").permitAll()
//                .antMatchers("/js/**", "/css/**", "/images/**", "/fronts/**", "/doc/**", "/toLogin").permitAll()
//                .antMatchers("/user/**").hasAnyRole("USER")
//                //.hasIpAddress()//读取配置权限配置
//                .antMatchers("/**").access("hasRole('ADMIN')")
//                .anyRequest().authenticated()
//                //自定义登录界面
//                .and().formLogin().loginPage("/toLogin").loginProcessingUrl("/login").failureUrl("/toLogin?error").permitAll()
//                .and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//                .and().exceptionHandling().accessDeniedPage("/toLogin?deny")
//                .and().httpBasic()
//                .and().sessionManagement().invalidSessionUrl("/toLogin")
//                .and().csrf().disable()
//                ;
//    }


    /**
     * 通过@EnableWebSecurity注解开启Spring Security的功能
     * 继承WebSecurityConfigurerAdapter，并重写它的方法来设置一些web安全的细节
     * configure(HttpSecurity http)方法
     * 通过authorizeRequests()定义哪些URL需要被保护、哪些不需要被保护。
     * 例如以上代码指定了/和/home不需要任何认证就可以访问，其他的路径都必须通过身份验证。
     * 通过formLogin()定义当需要用户登录时候，转到的登录页面。
     * configureGlobal(AuthenticationManagerBuilder auth)方法，在内存中创建了一个用户，该用户的名称为user，密码为password，用户角色为USER
     */
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests().antMatchers("/", "/home").permitAll().anyRequest().authenticated()
//                .and().formLogin().loginPage("/login").permitAll()
//                .and().logout().permitAll()
//                .and().rememberMe();
//    }


    /**
     * 简单实现 内存取值
     * .passwordEncoder(new BCryptPasswordEncoder())",
     * 这相当于登陆时用BCrypt加密方式对用户密码进行处理。
     * 这相当于对内存中的密码进行Bcrypt编码加密。比对时一致，说明密码正确，允许登陆。
     * ---------------------
     * 作者：Canon_in_D_Major
     * 来源：CSDN
     * 原文：https://blog.csdn.net/canon_in_d_major/article/details/79675033
     * 版权声明：本文为博主原创文章，转载请附上博文链接！
     */
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//
//        auth.
//                inMemoryAuthentication().
//                passwordEncoder(new BCryptPasswordEncoder()).
//                withUser("0002").
//                password(new BCryptPasswordEncoder().encode("cs")).
//                roles("USER");
//
//    }

}
