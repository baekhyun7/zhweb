package com.zhweb.util;

/**
 * @Author: ZH
 * @Date: 2019/2/22 0022 14:08
 * @Description:
 */
public class StringUtil {
    /**
     * 7      * 去除字符串首尾出现的某个字符.
     * 8      * @param source 源字符串.
     * 9      * @param element 需要去除的字符.
     * 10      * @return String.
     * 11
     */
    public static String trimFirstAndLastChar(String source, char element) {
        boolean beginIndexFlag = true;
        boolean endIndexFlag = true;
        do {
            int beginIndex = source.indexOf(element) == 0 ? 1 : 0;
            int endIndex = source.lastIndexOf(element) + 1 == source.length() ? source.lastIndexOf(element) : source.length();
            source = source.substring(beginIndex, endIndex);
            beginIndexFlag = (source.indexOf(element) == 0);
            endIndexFlag = (source.lastIndexOf(element) + 1 == source.length());
        } while (beginIndexFlag || endIndexFlag);
        return source;
    }
}
