package com.zhweb.util;

import java.util.UUID;

/**
 * @Author: ZH
 * @Date: 2019/1/18 0018 14:03
 * @Description:
 */
public class UUIDUtils {
    public static String creatUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

}
