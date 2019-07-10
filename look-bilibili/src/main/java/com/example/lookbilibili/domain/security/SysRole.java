package com.example.lookbilibili.domain.security;

import java.util.Date;

/**
 * @Description 权限
 * @Auther CB
 * @Date 2019-07-10 10:50
 * @Version 1.0
 **/
public class SysRole {
    private Integer rowId;
    private String roleName;
    private String notes;
    private Date createTime;

    public Integer getRowId() {
        return rowId;
    }

    public void setRowId(Integer rowId) {
        this.rowId = rowId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SysRole{" +
                "rowId=" + rowId +
                ", roleName='" + roleName + '\'' +
                ", notes='" + notes + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
