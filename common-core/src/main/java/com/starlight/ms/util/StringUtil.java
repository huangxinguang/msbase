package com.starlight.ms.util;

import java.util.UUID;

public class StringUtil {

    /**
     * 生成UUID主键
     *
     * @return
     */
    public static String genUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /**
     * 判断字符是否为空或者空串
     *
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str) {
        if (str == null || "".equals(str.trim())) {
            return false;
        }
        return true;
    }

    public static boolean isEmpty(String str) {
        if (str == null || "".equals(str.trim())) {
            return true;
        }
        return false;
    }

}
