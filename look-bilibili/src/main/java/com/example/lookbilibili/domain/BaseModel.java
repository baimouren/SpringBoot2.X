package com.example.lookbilibili.domain;


import java.util.List;
import java.util.Map;

/**
 * @Description 基本视图模型
 * @Auther CB
 * @Date 2019-08-28 10:44
 * @Version 1.0
 **/
public class BaseModel {
    private Integer count;
    private Integer pageNo;
    private Integer limit;
    private List<Object> result;
    private Map<String,Object> attr;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public List<Object> getResult() {
        return result;
    }

    public void setResult(List<Object> result) {
        this.result = result;
    }

    public Map<String, Object> getAttr() {
        return attr;
    }

    public void setAttr(Map<String, Object> attr) {
        this.attr = attr;
    }

    @Override
    public String toString() {
        return "BaseModel{" +
                "count=" + count +
                ", pageNo=" + pageNo +
                ", limit=" + limit +
                ", result=" + result +
                ", attr=" + attr +
                '}';
    }
}
