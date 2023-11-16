package com.sx.log.config;

import cn.hutool.setting.dialect.Props;

/**
 * 日志配置
 *
 * @author xiashoucong
 * @version 版 本 号：1.0.0
 * @since 2023/4/27 11:54
 */
public class LogConfig {

    public static String appCode;
    public static String logPath;
    public static String logName;

    static  {
        Props props = new Props("log.properties");
        appCode = props.getProperty("appCode");
        logPath = props.getProperty("logPath");
        logName = props.getProperty("logName");
    }
}
