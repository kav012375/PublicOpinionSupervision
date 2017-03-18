package com.supervision.service.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Zeus Feng on 2017/3/17.
 *
 * @author Zeus Feng
 * @date 2017/03/17
 */
public class EncryptionUtil {

    /**
     * Md5加密工具
     * @param input
     * @return 返回加密后字符串
     */
    public static String MD5Creator(String input){
        char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] inputByteArray = input.getBytes();
            messageDigest.update(inputByteArray);
            byte[] resultByteArray = messageDigest.digest();
            int arryLenth = resultByteArray.length;
            char str[] = new char[arryLenth * 2];
            int stepCounter = 0;
            for (int step = 0; step < arryLenth; step++) {
                byte byte0 = resultByteArray[step];
                str[stepCounter++] = hexDigits[byte0 >>> 4 & 0xf];
                str[stepCounter++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (NoSuchAlgorithmException e) {
            return e.toString();
        }
    }
}
