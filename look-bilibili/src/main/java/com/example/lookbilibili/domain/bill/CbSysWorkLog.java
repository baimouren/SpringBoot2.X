package com.example.lookbilibili.domain.bill;

import java.util.Date;

public class CbSysWorkLog {
    private Integer rowId;

    private String planToday;

    private String finished;

    private String planTomorrow;

    private Integer userId;

    private String userCode;

    private Date logDate;

    private Date createTime;

    private Integer companyId;

    private byte[] notes;

    public Integer getRowId() {
        return rowId;
    }

    public void setRowId(Integer rowId) {
        this.rowId = rowId;
    }

    public String getPlanToday() {
        return planToday;
    }

    public void setPlanToday(String planToday) {
        this.planToday = planToday == null ? null : planToday.trim();
    }

    public String getFinished() {
        return finished;
    }

    public void setFinished(String finished) {
        this.finished = finished == null ? null : finished.trim();
    }

    public String getPlanTomorrow() {
        return planTomorrow;
    }

    public void setPlanTomorrow(String planTomorrow) {
        this.planTomorrow = planTomorrow == null ? null : planTomorrow.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public Date getLogDate() {
        return logDate;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public byte[] getNotes() {
        return notes;
    }

    public void setNotes(byte[] notes) {
        this.notes = notes;
    }
}