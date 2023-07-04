package com.hliushi.test.common.bo;

import org.joda.time.DateTime;

/**
 * @author: hliushi
 * @date: 2023/3/2 23:42
 **/
public class BOBase extends EntityBase implements BizObject {

    public static final String BIZ_DISABLED_FIELD_NAME = "bizDisabled";
    public static final String BIZ_DISABLED_CN = "是否禁用";
    public static final String FLAG_DELETED_FIELD_NAME = "deleted";
    public static final String DELETED_CN = "是否删除";
    private static final long serialVersionUID = 1L;

    private Long version;


    private DateTime createTime;

    private String createUserId;

    private DateTime updateTime;

    private String updateUserId;

    private boolean bizDisabled;


    private boolean deleted;

    public BOBase() {
    }

    // @PrePersist
    public void prePersist() {
        this.createTime = DateTime.now();
        this.createUserId = "10000";
    }


    // @PreUpdate
    public void preUpdate() {
        this.updateTime = DateTime.now();
        this.updateUserId = "10000";
    }

    @Override
    public void onUpdateCheck() {

    }

    @Override
    public void onDeleteCheck() {

    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public DateTime getCreateTime() {
        return createTime;
    }

    @Override
    public void setCreateTime(DateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String getCreateUserId() {
        return createUserId;
    }

    @Override
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    @Override
    public boolean isBizDisabled() {
        return bizDisabled;
    }

    public void setBizDisabled(boolean bizDisabled) {
        this.bizDisabled = bizDisabled;
    }

    @Override
    public DateTime getUpdateTime() {
        return updateTime;
    }

    @Override
    public void setUpdateTime(DateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String getUpdateUserId() {
        return updateUserId;
    }

    @Override
    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    @Override
    public void disableInBiz(boolean flag) {
        this.bizDisabled = flag;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void markAsDeleted() {
        this.deleted = true;
    }
}
