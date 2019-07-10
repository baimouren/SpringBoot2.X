package com.example.lookbilibili.domain.security;

import java.util.Date;

/**
 * @Description 用户角色对照
 * @Auther CB
 * @Date 2019-06-21 14:24
 * @Version 1.0
 **/
public class SysUserRole {
    private Integer rowId;
    private String userId;
    private String roleId;
    private String notes;
    private Date createTime;

    public Integer getRowId() {
        return rowId;
    }

    public void setRowId(Integer rowId) {
        this.rowId = rowId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
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
        return "SysUserRole{" +
                "rowId=" + rowId +
                ", userId='" + userId + '\'' +
                ", roleId='" + roleId + '\'' +
                ", notes='" + notes + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
