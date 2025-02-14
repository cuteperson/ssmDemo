package com.demo.mms.service;

import com.demo.mms.common.domain.Midreport;
import com.demo.mms.dao.MidreportMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MidreportServicceImpl implements MidreportService{
    @Autowired
    MidreportMapper midreportMapper;
    @Transactional
    @Override
    public void addMidreport(Midreport midreport) {
        midreportMapper.insertMidreport(midreport);
    }
    @Transactional
    @Override
    public Integer addMaxversion(int course_id) {
        return midreportMapper.selectMaxversion(course_id);
    }
    @Transactional
    @Override
    public Midreport findreport(int course_id,int version) {
        return midreportMapper.selectMidreport(course_id,version);
    }
}
