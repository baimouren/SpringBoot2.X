package com.boot.demo.demo;

import java.util.Date;

public class WorkLogModel {
	private Integer rowId;
	private String planToday;
	private String finished;
	private String planTomorrow;
	private Integer userId;
	private String userCode;
	private String notes;
	private Date logDate;
	private Date createTime;
	private Integer companyId;
	
	
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
		this.planToday = planToday;
	}
	public String getFinished() {
		return finished;
	}
	public void setFinished(String finished) {
		this.finished = finished;
	}
	public String getPlanTomorrow() {
		return planTomorrow;
	}
	public void setPlanTomorrow(String planTomorrow) {
		this.planTomorrow = planTomorrow;
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
		this.userCode = userCode;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
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
	
	@Override
	public String toString() {
		return "WorkLogModel [rowId=" + rowId + ", planToday=" + planToday + ", finished=" + finished
				+ ", planTomorrow=" + planTomorrow + ", userId=" + userId + ", userCode=" + userCode + ", notes="
				+ notes + ", logDate=" + logDate + ", createTime=" + createTime + ", companyId=" + companyId + "]";
	}
	
}
