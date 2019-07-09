package com.example.lookbilibili.utils;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Description 自定义加密算法
 * @Auther CB
 * @Date 2019-07-09 17:00
 * @Version 1.0
 **/
public class MyPasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(CharSequence charSequence) {
        return MD5Util.encode((String)charSequence);
    }

    @Override
    public boolean matches(CharSequence charSequence, String encodedPassword) {
        return encodedPassword.equals(MD5Util.encode(String.valueOf(charSequence)));
    }
}
