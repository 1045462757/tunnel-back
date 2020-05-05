package com.example.tunnel.mapper;

import com.example.tunnel.domain.ConstructionDesign;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 10454
 */
@Mapper
public interface ConstructionDesignMapper {
    int deleteByPrimaryKey(String id);

    int insert(String id);

    ConstructionDesign selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ConstructionDesign record);

}