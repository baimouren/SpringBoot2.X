package com.example.lookbilibili.utils;

import com.example.lookbilibili.exception.MyException;
import org.thymeleaf.util.StringUtils;

import java.security.MessageDigest;

/**
 * @Description TODO
 * @Auther CB
 * @Date 2019-06-21 13:46
 * @Version 1.0
 **/
public class MD5Util {


    public static String encode(String password){
        StringBuffer hexValue = new StringBuffer();

        try { password = password.trim();
            if(StringUtils.isEmpty(password)){
                throw new MyException("密码不能为空");
            }

            MessageDigest md5 = null;
            try {
                md5 = MessageDigest.getInstance("MD5");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            char[] charArray = password.toCharArray();
            byte[] byteArray = new byte[charArray.length];

            for (int i = 0; i < charArray.length; i++)
                byteArray[i] = (byte) charArray[i];
            byte[] md5Bytes = md5.digest(byteArray);
            for (int i = 0; i < md5Bytes.length; i++) {
                int val = ((int) md5Bytes[i]) & 0xff;
                if (val < 16) {
                    hexValue.append("0");
                }

                hexValue.append(Integer.toHexString(val));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hexValue.toString();
    }

}
