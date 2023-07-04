package com.hliushi.test.common.dto;


import io.github.linpeilie.annotations.AutoMapping;
import org.joda.time.DateTime;

public class BaseDTO implements GeneralDTO {
    private static final long serialVersionUID = 1L;

    @AutoMapping(target = "id", ignore = true)
    private Long id;

    @AutoMapping(target = "version", ignore = true)
    private Long version;

    private boolean bizDisabled;

    @AutoMapping(ignore = true)
    private DateTime createTime;

    @AutoMapping(ignore = true)
    private DateTime updateTime;

    @AutoMapping(ignore = true)
    private String createUserId;

    @AutoMapping(ignore = true)
    private String updateUserId;

    @AutoMapping(ignore = true)
    private String displayLabel;

    @AutoMapping(ignore = true)
    private boolean deleted;

    public BaseDTO() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long var1) {
        this.id = var1;
    }

    public Long getVersion() {
        return this.version;
    }

    public void setVersion(Long var1) {
        this.version = var1;
    }

    public String getDisplayLabel() {
        return this.displayLabel;
    }

    public void setDisplayLabel(String var1) {
        this.displayLabel = var1;
    }

    public void setBOId(Long var1) {
        this.setId(var1);
    }

    public Long idOfBOToUpdate() {
        return this.getId();
    }

    public boolean isBizDisabled() {
        return this.bizDisabled;
    }

    public void setBizDisabled(boolean var1) {
        this.bizDisabled = var1;
    }

    public boolean isDeleted() {
        return this.deleted;
    }

    public void setDeleted(boolean var1) {
        this.deleted = var1;
    }

    public DateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(DateTime createTime) {
        this.createTime = createTime;
    }

    public DateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(DateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }
}
