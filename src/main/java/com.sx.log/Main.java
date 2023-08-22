package com.sx.log;

import com.sx.log.enums.AreaEnum;
import com.sx.log.enums.UserRoleEnum;
import com.sx.log.util.LogUtils;

/**
 * Main 测试
 *
 * @author xiashoucong
 * @version 版 本 号：1.0.0
 * @since 2023/4/27 9:01
 */
public class Main {
  public static void main(String[] args) {
      // 登录
      LogUtils.login("qqq", UserRoleEnum.MASSES_TYPE, "330105002");
      // 办事开始
      LogUtils.workStart("qqq", UserRoleEnum.MASSES_TYPE, "330105002", "123");
      // 办事结束
      LogUtils.workEnd("qqq", UserRoleEnum.MASSES_TYPE, "330105002", "123");
      // 业务日志
      LogUtils.bizLog("typeA", "1");
  }
}
