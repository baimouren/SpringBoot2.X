package com.example.lookbilibili.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description TODO
 * @Auther CB
 * @Date 2019-06-21 14:31
 * @Version 1.0
 **/
public class UserService /*implements UserDetailsService*/{

    private static final Logger logger = LogManager.getLogger(UserService.class);

//    @Override
//    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
//
//        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
//        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("ROLE_" + "USER");
//        grantedAuthorities.add(grantedAuthority);
//
//        User user = new User("0002","cs",
//                true, true, true, true, grantedAuthorities);
//        return user;
//    }
}
