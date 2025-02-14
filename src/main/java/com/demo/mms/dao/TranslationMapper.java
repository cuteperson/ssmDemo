package com.demo.mms.dao;

import com.demo.mms.common.domain.Translation;
import org.apache.ibatis.annotations.Param;

public interface TranslationMapper {

    int insertTranslation(Translation translation);

    Integer getVersion(int course_id);

    Translation selectTranslation(@Param("course_id") int course_id, @Param("version") int version);
}