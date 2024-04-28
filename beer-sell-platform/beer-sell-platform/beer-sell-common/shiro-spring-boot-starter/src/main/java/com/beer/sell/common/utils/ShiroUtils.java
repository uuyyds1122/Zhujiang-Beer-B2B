package com.beer.sell.common.utils;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;

public class ShiroUtils {
    public static final int HASH_ITERATIONS = 10;

    /**
     * @param oldPassword
     * @return
     */
    public static String encryption(String oldPassword) {
        /**
         * String algorithmName,  加密算法
         * Object source,  加密的字符串
         * Object salt,  加密盐
         * int hashIterations  加密次数
         */
        SimpleHash simpleHash = new SimpleHash(Md5Hash.ALGORITHM_NAME, oldPassword, null, HASH_ITERATIONS);
        return simpleHash.toString();
    }

    /**
     * 128
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(ShiroUtils.encryption("123456"));
    }

}
