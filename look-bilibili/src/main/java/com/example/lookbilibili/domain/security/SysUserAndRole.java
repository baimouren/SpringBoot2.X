package com.example.lookbilibili.domain.security;

import java.util.Date;

/**
 * @Description 用户角色中文对照
 * @Auther CB
 * @Date 2019-06-21 14:24
 * @Version 1.0
 **/
public class SysUserAndRole {
    private Integer rowId;
    private String userId;
    private String userName;
    private String roleId;
    private String roleName;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
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
        return "SysUserAndRole{" +
                "rowId=" + rowId +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", roleId='" + roleId + '\'' +
                ", roleName='" + roleName + '\'' +
                ", notes='" + notes + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
