package com.example.lookbilibili.domain.bill;

import java.util.Date;

public class CbMBill {
    private Integer rowId;

    private Date startTime;

    private Date endTime;

    private Double billAmount;

    private String billPayer;

    private String billUser;

    private String billStore;

    private Integer billPayWay;

    private Date billSubmitDate;

    private String imgPackage;

    private String imgId;

    private String notes;

    private Date reviseTime;

    private Date createTime;

    public Integer getRowId() {
        return rowId;
    }

    public void setRowId(Integer rowId) {
        this.rowId = rowId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(Double billAmount) {
        this.billAmount = billAmount;
    }

    public String getBillPayer() {
        return billPayer;
    }

    public void setBillPayer(String billPayer) {
        this.billPayer = billPayer == null ? null : billPayer.trim();
    }

    public String getBillUser() {
        return billUser;
    }

    public void setBillUser(String billUser) {
        this.billUser = billUser == null ? null : billUser.trim();
    }

    public String getBillStore() {
        return billStore;
    }

    public void setBillStore(String billStore) {
        this.billStore = billStore == null ? null : billStore.trim();
    }

    public Integer getBillPayWay() {
        return billPayWay;
    }

    public void setBillPayWay(Integer billPayWay) {
        this.billPayWay = billPayWay;
    }

    public Date getBillSubmitDate() {
        return billSubmitDate;
    }

    public void setBillSubmitDate(Date billSubmitDate) {
        this.billSubmitDate = billSubmitDate;
    }

    public String getImgPackage() {
        return imgPackage;
    }

    public void setImgPackage(String imgPackage) {
        this.imgPackage = imgPackage == null ? null : imgPackage.trim();
    }

    public String getImgId() {
        return imgId;
    }

    public void setImgId(String imgId) {
        this.imgId = imgId == null ? null : imgId.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public Date getReviseTime() {
        return reviseTime;
    }

    public void setReviseTime(Date reviseTime) {
        this.reviseTime = reviseTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}