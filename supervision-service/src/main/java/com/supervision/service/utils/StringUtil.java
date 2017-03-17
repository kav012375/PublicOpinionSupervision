package com.supervision.service.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Zeus Feng on 2017/3/17.
 *
 * @author Zeus Feng
 * @date 2017/03/17
 */
public class StringUtil {
    private static String regEx = "[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
    private static Pattern SPECIAL_CHARACTORS_PATTERN = Pattern.compile(regEx);
    private static Pattern CHINESE_CHARACTORS_PATTERN = Pattern.compile("[\u4e00-\u9fa5]");
    /**
     * 检查输入字符串中是否包含特殊字符
     * @param input
     * @return 存在特殊字符返回true
     */
    public static Boolean ifThereIsSpecialCharactorsInString(String input){
        Matcher m = SPECIAL_CHARACTORS_PATTERN.matcher(input);
        return (m.find());
    }

    /**
     * 检查输入字符串中是否包含中文
     * @param input
     * @return 存在特殊字符返回True,不存在返回false
     */
    public static Boolean ifThereIsChineseCharactorsInString(String input){
        Matcher m = CHINESE_CHARACTORS_PATTERN.matcher(input);
        return m.find();
    }

    /**
     * 移除字符串中的所有特殊字符
     * @param input
     * @return
     */
    public static String replaceAllSpecialCharactorsFromString(String input){
        input = SPECIAL_CHARACTORS_PATTERN.matcher(input).replaceAll("");
        return input;
    }
}
