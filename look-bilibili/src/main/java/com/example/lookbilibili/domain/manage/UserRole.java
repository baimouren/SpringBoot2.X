package com.example.lookbilibili.domain.manage;

import java.util.Date;

/**
 * @Description 角色
 * @Auther CB
 * @Date 2019-06-21 14:24
 * @Version 1.0
 **/
public class UserRole {
    private Integer rowId;
    private String userId;
    private String userRole;
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

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
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
        return "UserRole{" +
                "rowId=" + rowId +
                ", userId='" + userId + '\'' +
                ", userRole='" + userRole + '\'' +
                ", notes='" + notes + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
