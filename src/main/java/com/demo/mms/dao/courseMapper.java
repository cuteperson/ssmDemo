package com.demo.mms.dao;

import com.demo.mms.common.domain.course;

public interface courseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(course record);

    int insertSelective(course record);

    course selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(course record);

    int updateByPrimaryKey(course record);

    course selecourse(int student_id);

    void insertcourse(course course);
}