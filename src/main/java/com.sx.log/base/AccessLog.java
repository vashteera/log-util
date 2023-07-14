package com.sx.log.base;

import cn.hutool.core.date.DateUtil;
import com.sx.log.config.LogConfig;
import com.sx.log.enums.ActionTypeEnum;
import com.sx.log.enums.AreaEnum;
import com.sx.log.enums.UserRoleEnum;

/**
 * 操作日志
 *
 * @author xiashoucong
 * @version 版 本 号：1.0.0
 * @since 2023/4/27 10:32
 */
public class AccessLog {

    /**
     * 用户标识
     */
    private String userId;

    /**
     * 用户类型
     */
    private String userRole;

    /**
     * 子应用代码
     */
    private String appCode;

    /**
     * 行政区划代码
     */
    private String areaCode;

    /**
     * 操作类型
     */
    private String actionType;

    /**
     * 操作标识
     */
    private String actionId;

    /**
     * 操作时间
     */
    private String actionTime;

    /**
     * 操作时长
     */
    private String actionDuration;

    /**
     * 操作状态
     */
    private String actionStatus;

    /**
     * 业务指标类型
     */
    private String bizType;

    /**
     * 业务指标值
     */
    private String bizValue;

    public AccessLog(ActionTypeEnum actionTypeEnum, String bizType, String bizValue) {
        this.actionType = actionTypeEnum.getValue();
        this.bizType = bizType;
        this.bizValue = bizValue;
        this.actionTime = DateUtil.now();
        this.actionStatus = "0";
        this.appCode = LogConfig.appCode;
    }

    public AccessLog(String userId, UserRoleEnum userRoleEnum, AreaEnum areaEnum, ActionTypeEnum actionTypeEnum, String actionId) {
        this.userId = userId;
        this.userRole = userRoleEnum.getValue();
        this.areaCode = areaEnum.getValue();
        this.actionType = actionTypeEnum.getValue();
        this.actionId = actionId;
        this.actionTime = DateUtil.now();
        this.actionStatus = "0";
        this.appCode = LogConfig.appCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public String getActionTime() {
        return actionTime;
    }

    public void setActionTime(String actionTime) {
        this.actionTime = actionTime;
    }

    public String getActionDuration() {
        return actionDuration;
    }

    public void setActionDuration(String actionDuration) {
        this.actionDuration = actionDuration;
    }

    public String getActionStatus() {
        return actionStatus;
    }

    public void setActionStatus(String actionStatus) {
        this.actionStatus = actionStatus;
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public String getBizValue() {
        return bizValue;
    }

    public void setBizValue(String bizValue) {
        this.bizValue = bizValue;
    }

    @Override
    public String toString() {
        return "AccessLog{" +
                "userId='" + userId + '\'' +
                ", userRole='" + userRole + '\'' +
                ", appCode='" + appCode + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", actionType='" + actionType + '\'' +
                ", actionId='" + actionId + '\'' +
                ", actionTime='" + actionTime + '\'' +
                ", actionDuration='" + actionDuration + '\'' +
                ", actionStatus='" + actionStatus + '\'' +
                ", bizType='" + bizType + '\'' +
                ", bizValue='" + bizValue + '\'' +
                '}';
    }
}
