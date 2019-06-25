package com.example.lookbilibili.domain.manage;

import java.util.Date;

/**
 * @Description user实体类
 * @Auther CB
 * @Date 2019-06-20 19:00
 * @Version 1.0
 **/
public class SysUser {
    private Integer rowId ;

    private Integer sortNo;
    private String userCode;
    private String userPassword;
    private String role;
    private String userName;
    private String companyId;
    private String notes;
    private Date createTime;

    public Integer getRowId() {
        return rowId;
    }

    public void setRowId(Integer rowId) {
        this.rowId = rowId;
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
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
                ", sortNo=" + sortNo +
                ", userCode='" + userCode + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", role='" + role + '\'' +
                ", userName='" + userName + '\'' +
                ", companyId='" + companyId + '\'' +
                ", notes='" + notes + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
