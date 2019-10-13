package com.example.lookbilibili.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description 字符串驼峰转换
 * @Auther CB
 * @Date 2019-08-14 11:12
 * @Version 1.0
 **/
public class StringCamelUtil {

    /**
     * 下划线转驼峰法(默认小驼峰)
     *
     * @param line 源字符串
     * @param smallCamel 大小驼峰,是否为小驼峰(驼峰，第一个字符是大写还是小写) 默认小驼峰
     * @return 转换后的字符串
     */
    public static String underline2Camel(String line, boolean ... smallCamel) {
        if (line == null || "".equals(line)) {
            return "";
        }

        StringBuffer sb = new StringBuffer();
        Pattern pattern = Pattern.compile("([A-Za-z\\d]+)(_)?");
        Matcher matcher = pattern.matcher(line);
        //匹配正则表达式
        while (matcher.find()) {
            String word = matcher.group();
            //当是true 或则是空的情况
            if((smallCamel.length ==0 || smallCamel[0] ) && matcher.start()==0){
                sb.append(Character.toLowerCase(word.charAt(0)));
            }else{
                sb.append(Character.toUpperCase(word.charAt(0)));
            }

            int index = word.lastIndexOf('_');
            if (index > 0) {
                sb.append(word.substring(1, index).toLowerCase());
            } else {
                sb.append(word.substring(1).toLowerCase());
            }
        }
        return sb.toString();
    }

    /**
     * 驼峰法转下划线
     *
     * @param line 原字符串
     * @param smallCamel 是否转小写 默认smallCamel:true 全小写
     * @return 转换后的字符串
     */
    public static String camel2Underline(String line,Boolean ... smallCamel) {
        if (line == null || "".equals(line)) {
            return "";
        }
        line = String.valueOf(line.charAt(0)).toUpperCase()
                .concat(line.substring(1));
        StringBuffer sb = new StringBuffer();
        Pattern pattern = Pattern.compile("[A-Z]([a-z\\d]+)?");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            String word = matcher.group();
            sb.append(word.toUpperCase());
            sb.append(matcher.end() == line.length() ? "" : "_");
        }

        if(smallCamel.length > 0 && !smallCamel[0])
            return sb.toString().toLowerCase();
        return sb.toString();
    }

}
