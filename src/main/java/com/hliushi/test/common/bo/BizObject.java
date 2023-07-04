package com.hliushi.test.common.bo;

import org.joda.time.DateTime;

public interface BizObject extends BizEntity {
    String CREATE_TIME_CN = "创建时间";
    String CREATE_USER_ID_CN = "创建用户Id";
    String UPDATE_TIME_CN = "修改时间";
    String UPDATE_USER_ID_CN = "修改用户Id";

    default String getCreateUserId() {
        return null;
    }

    default void setCreateUserId(String var1) {
    }

    default DateTime getCreateTime() {
        return null;
    }

    default void setCreateTime(DateTime createTime) {

    }

    default String getUpdateUserId() {
        return null;
    }

    default void setUpdateUserId(String var1) {
    }

    default DateTime getUpdateTime() {
        return null;
    }

    default void setUpdateTime(DateTime updateTime) {

    }

    void onUpdateCheck();

    void onDeleteCheck();

    default boolean isBizDisabled() {
        return false;
    }

    default void disableInBiz(boolean var1) {
        throw new RuntimeException("Feature not implemented");
    }
}
