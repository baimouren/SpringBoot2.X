package com.example.lookbilibili.service;

import com.example.lookbilibili.domain.UserRole;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Description TODO
 * @Auther CB
 * @Date 2019-06-21 14:31
 * @Version 1.0
 **/
public class UserService implements UserDetailsService{

    private static final Logger logger = LogManager.getLogger(UserService.class);

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("ROLE_" + "USER");
        grantedAuthorities.add(grantedAuthority);

        User user = new User("0002","cs",
                true, true, true, true, grantedAuthorities);
        return user;
    }
}
