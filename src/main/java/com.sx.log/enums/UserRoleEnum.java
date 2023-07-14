package com.sx.log.enums;

/**
 * 用户类型
 *
 * @author xiashoucong
 * @version 版 本 号：1.0.0
 * @since 2023/4/27 9:09
 */
public enum UserRoleEnum {
    MASSES_TYPE("群众", "群众"),
    ENTERPRISE_TYPE("企业", "企业"),
    GOVERNMENT_STAFF_TYPE("政府工作人员", "政府工作人员"),
    THIRD_PARTY_TYPE("第三方", "第三方"),
    ;

    /**
     * 值
     */
    private String value;

    /**
     * 名称
     */
    private String name;

    UserRoleEnum(String value, String name) {
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
