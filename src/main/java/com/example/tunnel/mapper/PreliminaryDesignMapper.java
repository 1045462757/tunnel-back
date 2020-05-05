package com.example.tunnel.mapper;

import com.example.tunnel.domain.PreliminaryDesign;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 10454
 */
@Mapper
public interface PreliminaryDesignMapper {
    int deleteByPrimaryKey(String id);

    int insert(String id);

    PreliminaryDesign selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PreliminaryDesign record);
}