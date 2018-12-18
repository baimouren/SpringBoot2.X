package com.boot.demo.demo;

public class User {
	
	private  Long  rowId;
	private  String  loginName;
	private  String  password;
	private  String  userName;
	private  String  phone;
	private  String  address;
	private  String  createTime;
	
	public Long getRowId() {
		return rowId;
	}
	public void setRowId(Long rowId) {
		this.rowId = rowId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "UserMapping [rowId=" + rowId + ", loginName=" + loginName + ", password=" + password + ", userName="
				+ userName + ", phone=" + phone + ", address=" + address + ", createTime=" + createTime + "]";
	}
	
}
