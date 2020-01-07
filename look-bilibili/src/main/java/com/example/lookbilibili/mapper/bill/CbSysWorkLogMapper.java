package com.example.lookbilibili.mapper.bill;

import com.example.lookbilibili.domain.bill.CbSysWorkLog;

public interface CbSysWorkLogMapper {
    int deleteByPrimaryKey(Integer rowId);

    int insert(CbSysWorkLog record);

    int insertSelective(CbSysWorkLog record);

    CbSysWorkLog selectByPrimaryKey(Integer rowId);

    int updateByPrimaryKeySelective(CbSysWorkLog record);

    int updateByPrimaryKeyWithBLOBs(CbSysWorkLog record);

    int updateByPrimaryKey(CbSysWorkLog record);
}