package com.example.lookbilibili.mapper.bill;

import com.example.lookbilibili.domain.bill.CbMBill;

public interface CbMBillMapper {
    int deleteByPrimaryKey(Integer rowId);

    int insert(CbMBill record);

    int insertSelective(CbMBill record);

    CbMBill selectByPrimaryKey(Integer rowId);

    int updateByPrimaryKeySelective(CbMBill record);

    int updateByPrimaryKey(CbMBill record);
}