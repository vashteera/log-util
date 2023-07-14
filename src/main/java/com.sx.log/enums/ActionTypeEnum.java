package com.sx.log.enums;

/**
 * 用户操作类型
 *
 * @author xiashoucong
 * @version 版 本 号：1.0.0
 * @since 2023/4/27 9:10
 */
public enum ActionTypeEnum {
    LOGIN_TYPE("1", "登录"),
    LOGOUT_TYPE("2", "离开"),
    WORK_START_TYPE("3", "办事开始"),
    WORK_END_TYPE("4", "办事结束"),
    BIZ_LOG_TYPE("5", "业务日志")
    ;

    /**
     * 值
     */
    private String value;

    /**
     * 名称
     */
    private String name;

    ActionTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
