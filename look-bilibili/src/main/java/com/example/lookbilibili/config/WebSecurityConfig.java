package com.example.lookbilibili.config;

import com.example.lookbilibili.utils.MyPasswordEncoder;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.InMemoryUserDetailsManagerConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;

import javax.sql.DataSource;

/**
 * @Description 安全控制
 * @Auther CB
 * @Date 2019-06-21 11:26
 * @Version 1.0
 **/
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


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
 * 第一种自定义用户认证服务
 */
//    @Override
//    public void configure(AuthenticationManagerBuilder auth) throws Exception {
//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        auth
//                .inMemoryAuthentication()
//                .passwordEncoder(passwordEncoder)
//                .withUser("0002")
//                .password(passwordEncoder.encode("cs"))
//                .roles("USER")
//                .and()
//                .withUser("admin")
//                .password(passwordEncoder.encode("1234"))
//                .roles("USER", "ADMIN")
//        ;
//
//    }

    /**
     * 第二种自定义用户认证服务
     * 取消连接方法 and()
     */
//    @Override
//protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        // 内存存储
//        InMemoryUserDetailsManagerConfigurer<AuthenticationManagerBuilder> userConfig =
//                auth.inMemoryAuthentication().passwordEncoder(passwordEncoder);
//        userConfig.withUser("admin")
//                .password(passwordEncoder.encode("cs"))
//        .authorities("ROLE_ADMIN","ROLE_USER");
//        userConfig.withUser("0002")
//                .password(passwordEncoder.encode("cs"))
//                .authorities("ROLE_USER");
//
//}

    /**
     * 第三种自定义用户认证服务
     * 数据库认证
     */
//    @Autowired
//    private DataSource dataSource = null;
//
//    private String pwdQuery = "select t.USER_CODE as user_name,t.USER_PASSWORD as pwd,1 as available from xnjia_mysalf.cb_sys_user T where t.user_code = ? ";
//    private String roleQuery = "select T2.USER_CODE AS USER_NAME, T3.ROLE_NAME FROM CB_SYS_USER_ROLE t1 LEFT JOIN CB_SYS_USER T2 ON T1.USER_ID = T2.ROW_ID LEFT JOIN CB_SYS_ROLE t3 ON T1.ROLE_ID = T3.ROW_ID where t2.USER_CODE = ? ";
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        auth.jdbcAuthentication()
//                .passwordEncoder(passwordEncoder)
//                .dataSource(dataSource)
//                .usersByUsernameQuery(pwdQuery)
//                .authoritiesByUsernameQuery(roleQuery);
//
//    }

    /**
     * 第三种自定义用户认证服务
     * 数据库认证 + 密码阴匙
     */
//    @Autowired
//    private DataSource dataSource = null;
//
//    private String pwdQuery = "select t.USER_CODE as user_name,t.USER_PASSWORD as pwd,1 as available from xnjia_mysalf.cb_sys_user T where t.user_code = ? ";
//    private String roleQuery = "select T2.USER_CODE AS USER_NAME, T3.ROLE_NAME FROM CB_SYS_USER_ROLE t1 LEFT JOIN CB_SYS_USER T2 ON T1.USER_ID = T2.ROW_ID LEFT JOIN CB_SYS_ROLE t3 ON T1.ROLE_ID = T3.ROW_ID where t2.USER_CODE = ? ";
//
//    @Value("${system.user.password.secret}")
//    private String secret = null;
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        PasswordEncoder passwordEncoder = new Pbkdf2PasswordEncoder(this.secret);
//        auth.jdbcAuthentication()
//                .passwordEncoder(passwordEncoder)
//                .dataSource(dataSource)
//                .usersByUsernameQuery(pwdQuery)
//                .authoritiesByUsernameQuery(roleQuery);
//
//    }

    /**
     * 第三种自定义用户认证服务
     * 数据库认证 + MD5加密
     */
//    @Autowired
//    private DataSource dataSource = null;
//
//    private String pwdQuery = "select t.USER_CODE as user_name,t.USER_PASSWORD as pwd,1 as available from xnjia_mysalf.cb_sys_user T where t.user_code = ? ";
//    private String roleQuery = "select T2.USER_CODE AS USER_NAME, T3.ROLE_NAME FROM CB_SYS_USER_ROLE t1 LEFT JOIN CB_SYS_USER T2 ON T1.USER_ID = T2.ROW_ID LEFT JOIN CB_SYS_ROLE t3 ON T1.ROLE_ID = T3.ROW_ID where t2.USER_CODE = ? ";
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        PasswordEncoder passwordEncoder = new MyPasswordEncoder();
//        auth.jdbcAuthentication()
//                .passwordEncoder(passwordEncoder)
//                .dataSource(dataSource)
//                .usersByUsernameQuery(pwdQuery)
//                .authoritiesByUsernameQuery(roleQuery);
//
//    }

    /**
     * 第三种自定义用户认证服务
     * 数据库认证 + MD5加密 + 传统mybatis方式
     */
    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        PasswordEncoder passwordEncoder = new MyPasswordEncoder();
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 限定通过签名的请求
        http.authorizeRequests()
            // 限定/index或/p/*，请求赋予角色 ROLE_USER/ROLE_ADMIN
            .antMatchers("/index","/hello", "/p/**").hasAnyRole("USER","ADMIN")
            .antMatchers("/admin/**").hasAuthority("ROLE_ADMIN")
            // 其他路径允许签名后访问
            .anyRequest().permitAll()
            /* 对于没有配置权限的其他请求允许匿名访问 */
            .and().anonymous()
            /* 使用spring */
            .and().formLogin().loginPage("/login").permitAll()
            .and().logout().permitAll()
            .and().rememberMe();
    }

}
