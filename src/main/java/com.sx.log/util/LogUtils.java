package com.sx.log.util;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.file.FileAppender;
import cn.hutool.json.JSONUtil;
import com.sx.log.base.AccessLog;
import com.sx.log.config.LogConfig;
import com.sx.log.enums.ActionTypeEnum;
import com.sx.log.enums.AreaEnum;
import com.sx.log.enums.UserRoleEnum;

import java.io.File;

/**
 * 日志工具类
 *
 * @author xiashoucong
 * @version 版 本 号：1.0.0
 * @since 2023/4/27 9:43
 */
public class LogUtils {

    private static final String LOG_NAME = "/access-log.log";

    public static void login(String userId, UserRoleEnum userRoleEnum, String areaCode) {
        saveLog(new AccessLog(userId,userRoleEnum, areaCode, ActionTypeEnum.LOGIN_TYPE, ""));
    }

    public static void logout(String userId, UserRoleEnum userRoleEnum, String areaCode) {
        saveLog(new AccessLog(userId,userRoleEnum, areaCode, ActionTypeEnum.LOGOUT_TYPE, ""));
    }

    public static void workStart(String userId, UserRoleEnum userRoleEnum, String areaCode, String actionId) {
        saveLog(new AccessLog(userId,userRoleEnum, areaCode, ActionTypeEnum.WORK_START_TYPE, actionId));
    }

    public static void workEnd(String userId, UserRoleEnum userRoleEnum, String areaCode, String actionId) {
        saveLog(new AccessLog(userId,userRoleEnum, areaCode, ActionTypeEnum.WORK_END_TYPE, actionId));
    }

    

    public static void bizLog(String bizType, String bizValue) {
        saveLog(new AccessLog(ActionTypeEnum.BIZ_LOG_TYPE, bizType, bizValue));
    }

    private static void saveLog (AccessLog accessLog) {
        File logFile = FileUtil.file(LogConfig.logPath + LOG_NAME);
        if(!logFile.exists()) {
            logFile = FileUtil.touch(logFile);
        }
        FileAppender logFileAppender = new FileAppender(logFile, 16 ,true);
        logFileAppender.append(JSONUtil.toJsonStr(accessLog));
        logFileAppender.flush();
    }
}
