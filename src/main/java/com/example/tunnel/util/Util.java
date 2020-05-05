package com.example.tunnel.util;

import java.util.UUID;

public class Util {

    /**
     * 生成10位随机Id
     *
     * @return 用户Id
     */
    public static String randomId() {
        return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 10);
    }
}
